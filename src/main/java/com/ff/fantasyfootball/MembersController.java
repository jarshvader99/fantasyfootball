package com.ff.fantasyfootball;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MembersController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	TeamRepository teamRepository;
	@Autowired
	LeagueRepository leagueRepository;

	@GetMapping(value = "/members/{league_id}")
	public String team(@PathVariable(value = "league_id") Integer league_id, Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		String view = null;
		Integer numOfTeams = 0;
		List<League> leagues = leagueRepository.findAll();
		for(League league : leagues)
		{
			if(league.getLeague_id() == league_id)
			{
				model.addAttribute("league", league);
				numOfTeams = league.getNum_teams_in_league();
				List<Integer> teamsInLeague = new ArrayList<Integer>();
				if(league.getTeam1_id() != null)
				{
					teamsInLeague.add(league.getTeam1_id());
				}
				if(league.getTeam2_id() != null)
				{
					teamsInLeague.add(league.getTeam2_id());
				}
				if(league.getTeam3_id() != null)
				{
					teamsInLeague.add(league.getTeam3_id());
				}
				if(league.getTeam4_id() != null)
				{
					teamsInLeague.add(league.getTeam4_id());
				}
				if(league.getTeam5_id() != null)
				{
					teamsInLeague.add(league.getTeam5_id());
				}
				if(league.getTeam6_id() != null)
				{
					teamsInLeague.add(league.getTeam6_id());
				}
				if(league.getTeam7_id() != null)
				{
					teamsInLeague.add(league.getTeam7_id());
				}
				if(league.getTeam8_id() != null)
				{
					teamsInLeague.add(league.getTeam8_id());
				}
				if(league.getTeam9_id() != null)
				{
					teamsInLeague.add(league.getTeam9_id());
				}
				if(league.getTeam10_id() != null)
				{
					teamsInLeague.add(league.getTeam10_id());
				}
				if(league.getTeam11_id() != null)
				{
					teamsInLeague.add(league.getTeam11_id());
				}
				if(league.getTeam12_id() != null)
				{
					teamsInLeague.add(league.getTeam12_id());
				}
				if(league.getTeam13_id() != null)
				{
					teamsInLeague.add(league.getTeam13_id());
				}
				if(league.getTeam14_id() != null)
				{
					teamsInLeague.add(league.getTeam14_id());
				}
				if(league.getTeam15_id() != null)
				{
					teamsInLeague.add(league.getTeam15_id());
				}
				if(league.getTeam16_id() != null)
				{
					teamsInLeague.add(league.getTeam16_id());
				}
				if(league.getTeam17_id() != null)
				{
					teamsInLeague.add(league.getTeam17_id());
				}
				if(league.getTeam18_id() != null)
				{
					teamsInLeague.add(league.getTeam18_id());
				}
				if(league.getTeam19_id() != null)
				{
					teamsInLeague.add(league.getTeam19_id());
				}
				if(league.getTeam20_id() != null)
				{
					teamsInLeague.add(league.getTeam20_id());
				}
				model.addAttribute("slottedTeams", teamsInLeague.size());
				model.addAttribute("teamsInLeague", teamsInLeague);
				List<User> users = userRepository.findAll();
				List<Team> teams = teamRepository.findAll();
				List<String> teamsInLeagueManager = new ArrayList<String>();
				for(User member : users)
				{
					for(Integer teamsInLeagueId : teamsInLeague)
					{
						Team team = teamRepository.getOne(teamsInLeagueId);
						if(team != null && team.getTeam_id() == teamsInLeagueId && 
								team.getOwner_id() == member.getUser_id())
						{
							if(StringUtils.hasText(member.getUsername()))
							{
								teamsInLeagueManager.add(member.getUsername());
							}
						}
					}
				}
				model.addAttribute("teamsInLeagueManagers", teamsInLeagueManager);
			}
		}
		model.addAttribute("league_id", league_id);
		model.addAttribute("template", "members");
		model.addAttribute("user", user);
		return "index";
	}
}
