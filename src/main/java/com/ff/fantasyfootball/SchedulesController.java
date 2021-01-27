package com.ff.fantasyfootball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class SchedulesController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LeagueRepository leagueRepository;
	
	@Autowired
	TeamRepository teamRepository;
	
	@GetMapping(value = "/schedules", produces = MediaType.APPLICATION_JSON_VALUE)
	public String schedules(@RequestParam(name="year") String year, Model model) 
	{
		final String uri = "https://api.sportsdata.io/v3/nfl/scores/json/Schedules/" + year + "?key=e416e565fd6c45e6b630e2cf0a7b4931";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    ObjectMapper mapper = new ObjectMapper();
	    String result = restTemplate.getForObject(uri, String.class);
   	    // convert JSON array to List
	    try 
	    {
			List<Schedule> schedules = Arrays.asList(mapper.readValue(result, Schedule[].class));
			model.addAttribute("schedules", schedules);
			
		} 
	    catch (JsonMappingException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    catch (JsonProcessingException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "schedules";
	}
	
	@GetMapping(value = "/viewSchedule/{league_id}")
	public String mySchedule(@PathVariable(value = "league_id") Integer league_id, HttpServletRequest request, Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		List<League> leagues = leagueRepository.findAll();
		List<Team> teams = teamRepository.findAll();
		List<Team> teamsInLeague = new ArrayList<Team>();
		List<Team> vTeamsInLeague = new ArrayList<Team>();
		Match match = new Match();
		Map<Integer, Match> matches = new LinkedHashMap<>();
		Map<Integer, Match> matchUps = new LinkedHashMap<>();
//		Map<Integer, Map<Integer, Match>> matches = new LinkedHashMap<>();
		Integer week;
		if(!CollectionUtils.isEmpty(leagues))
		{
			for(League league : leagues)
			{
				if(league.getLeague_id() == league_id)
				{
					for(Team team : teams)
					{
						if(team.getTeam_id() == league.getTeam1_id() || team.getTeam_id() == league.getTeam2_id()
								|| team.getTeam_id() == league.getTeam3_id() || team.getTeam_id() == league.getTeam4_id() || team.getTeam_id() == league.getTeam5_id()
								|| team.getTeam_id() == league.getTeam6_id() || team.getTeam_id() == league.getTeam7_id() || team.getTeam_id() == league.getTeam8_id()
								|| team.getTeam_id() == league.getTeam9_id() || team.getTeam_id() == league.getTeam10_id() || team.getTeam_id() == league.getTeam11_id()
								|| team.getTeam_id() == league.getTeam12_id() || team.getTeam_id() == league.getTeam13_id() || team.getTeam_id() == league.getTeam14_id()
								|| team.getTeam_id() == league.getTeam15_id() || team.getTeam_id() == league.getTeam16_id() || team.getTeam_id() == league.getTeam17_id()
								|| team.getTeam_id() == league.getTeam18_id() || team.getTeam_id() == league.getTeam19_id() || team.getTeam_id() == league.getTeam20_id())
						{
							teamsInLeague.add(team);
							vTeamsInLeague.add(team);
						}
					}
					int count = 0;
					for(week = 1; week <= 14; week++) 
					{
						Collections.reverse(teamsInLeague);
						for(Team teamInLeagueList : teamsInLeague)
						{
							for(Team visitingTeam : teamsInLeague)
							{
								if(teamInLeagueList.getOwner_id() != visitingTeam.getOwner_id())
								{
									match.setWeek(week);
									match.setTeams(teamInLeagueList, visitingTeam);
									matches.put(count, match);
									count++;
								}
								break;
							}
						}
					}
				}
			}
		}
		
		model.addAttribute("matches", matches);
		model.addAttribute("matchUps", matchUps);
		model.addAttribute("template", "schedule");
		model.addAttribute("user", user);
		return "index";
	}
}
