package com.ff.fantasyfootball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class TeamController {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	TeamRepository teamRepository;
	@Autowired
	LeagueRepository leagueRepository;
	
	@GetMapping(value = "/team/{league_id}")
	public String team(@PathVariable(value = "league_id") Integer league_id, Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		String view = null;
		List<Team> teams = teamRepository.findAll();
		Optional<League> league = leagueRepository.findById(league_id);
		model.addAttribute("league_name", league.get().getLeague_name());
		model.addAttribute("league_id", league.get().getLeague_id());
		List<Team> myTeams = new ArrayList<Team>();
		for(Team team : teams)
		{
			if(team.getLeague_id() == league_id)
			{
				model.addAttribute("team", team);
				myTeams.add(team);
			}
		}
		if(CollectionUtils.isEmpty(myTeams))
		{
			view = "redirect:/createTeam/" + league_id;
		}
		else
		{
			for(Team team : teams)
			{
				model.addAttribute("teams", teams);
				
				RestTemplate restTemplate = new RestTemplate();
			    ObjectMapper mapper = new ObjectMapper();
			    mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
			    String result = null;
			    List<Integer> players = new ArrayList<Integer>();
			    players.add(team.getQb1_id());
			    players.add(team.getRb1_id());
			    players.add(team.getRb2_id());
			    players.add(team.getWr1_id());
			    players.add(team.getWr2_id());
			    players.add(team.getTe_id());
			    players.add(team.getFlex_id());
//			    players.add(team.getDefense_id());
			    players.add(team.getKicker_id());
			    List<Player> myPlayers = new ArrayList<Player>();
			    for(Integer player : players)
				{
					if(!StringUtils.isEmpty(player))
					{
						final String uri = "https://api.sportsdata.io/v3/nfl/scores/json/Player/" + player + "?key=e416e565fd6c45e6b630e2cf0a7b4931";
						result = restTemplate.getForObject(uri, String.class);
					}
			   	    // convert JSON array to List
				    try 
				    {
						List<Player> playersApi = Arrays.asList(mapper.readValue(result, Player[].class));
						model.addAttribute("playersApi", playersApi);
						myPlayers.addAll(playersApi);
						model.addAttribute("myPlayers", myPlayers);
					} 
				    catch (JsonProcessingException e) 
				    {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
			model.addAttribute("template", "team");
			view = "index";
		}
		model.addAttribute("user", user);
		return view;
	}
	
	@GetMapping(value = "/createTeam/{league_id}")
	public String createTeam(@PathVariable(value = "league_id") Integer league_id, Model model) 
	{
	    model.addAttribute("addTeamForm", new AddTeamForm());
	    model.addAttribute("league_id", league_id);
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		model.addAttribute("template", "createTeam");
		model.addAttribute("user", user);
		return "index";
	}
	
	@PostMapping("/addTeam/{league_id}")
    public String addTeam(@PathVariable(value = "league_id") Integer league_id, HttpServletRequest request, @ModelAttribute AddTeamForm addTeamForm, Model model) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		Team team = new Team();
		team.setOwner_id(user.getUser_id());
		team.setLeague_id(league_id);
		team.setQb1_id(addTeamForm.getQb1_id());
		team.setRb1_id(addTeamForm.getRb1_id());
		team.setRb2_id(addTeamForm.getRb2_id());
		team.setWr1_id(addTeamForm.getWr1_id());
		team.setWr2_id(addTeamForm.getWr2_id());
		team.setTe_id(addTeamForm.getTe_id());
		team.setFlex_id(addTeamForm.getFlex_id());
		team.setDefense_id(addTeamForm.getDefense_id());
		team.setKicker_id(addTeamForm.getKicker_id());
		
		teamRepository.save(team);
		
		List<League> leagues = leagueRepository.findAll();
		if(!CollectionUtils.isEmpty(leagues))
		{
			for(League league : leagues)
			{
				if(league.getLeague_id() == league_id && league.getCreated_by_id() == user.getUser_id())
				{
					league.setTeam1_id(user.getUser_id());
					leagueRepository.save(league);
				}
			}
		}
		model.addAttribute("template", "teamNew");
		model.addAttribute("user", user);
		return "index";
        		
    }
}
