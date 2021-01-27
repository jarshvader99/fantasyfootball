package com.ff.fantasyfootball;

import com.ff.fantasyfootball.LeagueRepository;
import com.ff.fantasyfootball.League;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;


@Controller
public class CreateLeagueController {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	LeagueRepository leagueRepository;
	@Autowired
	TeamRepository teamRepository;
	
	@GetMapping(value = "/createLeague")
	public String createLeague(Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		model.addAttribute("addLeagueForm", new AddLeagueForm());
		List<League> leagues = leagueRepository.findAll();
		for(League league : leagues)
		{
			model.addAttribute("leagueId", league.getLeague_id());
			model.addAttribute("leagueName", league.getLeague_name());	
		}
		model.addAttribute("template", "createLeague");
		model.addAttribute("user", user);
		return "index";
	}
	
	@GetMapping(value = "/updateLeague/{league_id}") 
    public String updateLeague(@PathVariable(value = "league_id") Integer league_id, Model model)
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		model.addAttribute("updateLeagueForm", new UpdateLeagueForm());
		List<League> leagues = leagueRepository.findAll();
		for(League league : leagues)
		{
			if(league.getLeague_id() == league_id)
			{
				model.addAttribute("leagueId", league.getLeague_id());
				model.addAttribute("leagueName", league.getLeague_name());
			}
		}
		model.addAttribute("template", "updateLeague");
		model.addAttribute("user", user);
		return "index";
	}
	
	@GetMapping(value = "/myLeagues")
	public String myLeagues(HttpServletRequest request, Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		List<League> leagues = leagueRepository.findAll();
		if(!CollectionUtils.isEmpty(leagues))
		{
			List<League> myLeagues = new ArrayList<League>();
			for(League league : leagues)
			{
				if(league.getCreated_by_id() == user.getUser_id() || user.getUser_id().equals(league.getTeam1_id()) || user.getUser_id().equals(league.getTeam2_id()) 
						|| user.getUser_id().equals(league.getTeam3_id()) || user.getUser_id().equals(league.getTeam4_id()) || user.getUser_id().equals(league.getTeam5_id()) 
						|| user.getUser_id().equals(league.getTeam6_id()) || user.getUser_id().equals(league.getTeam7_id()) || user.getUser_id().equals(league.getTeam8_id()) 
						|| user.getUser_id().equals(league.getTeam9_id()) || user.getUser_id().equals(league.getTeam10_id()) || user.getUser_id().equals(league.getTeam11_id()) 
						|| user.getUser_id().equals(league.getTeam12_id()) || user.getUser_id().equals(league.getTeam13_id()) || user.getUser_id().equals(league.getTeam14_id()) 
						|| user.getUser_id().equals(league.getTeam15_id()) || user.getUser_id().equals(league.getTeam16_id()) || user.getUser_id().equals(league.getTeam17_id()) 
						|| user.getUser_id().equals(league.getTeam18_id()) || user.getUser_id().equals(league.getTeam19_id()) || user.getUser_id().equals(league.getTeam20_id()) )
				{
					myLeagues.add(league);
					model.addAttribute("myLeagues", myLeagues);
				}
			}
		}
		model.addAttribute("template", "myLeague");
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping(value="/leagues")
    public @ResponseBody List<League> getLeagues(Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		List<League> leagues = leagueRepository.findAll();
		List<League> myLeagues = new ArrayList<League>();
		if(!CollectionUtils.isEmpty(leagues))
		{
			for(League league : leagues)
			{
				if(league.getCreated_by_id() == user.getUser_id() || user.getUser_id() == league.getTeam1_id() || user.getUser_id() == league.getTeam2_id()
						|| user.getUser_id() == league.getTeam3_id() || user.getUser_id() == league.getTeam4_id() || user.getUser_id() == league.getTeam5_id()
						|| user.getUser_id() == league.getTeam6_id() || user.getUser_id() == league.getTeam7_id() || user.getUser_id() == league.getTeam8_id()
						|| user.getUser_id() == league.getTeam9_id() || user.getUser_id() == league.getTeam10_id() || user.getUser_id() == league.getTeam11_id()
						|| user.getUser_id() == league.getTeam12_id() || user.getUser_id() == league.getTeam13_id() || user.getUser_id() == league.getTeam14_id()
						|| user.getUser_id() == league.getTeam15_id() || user.getUser_id() == league.getTeam16_id() || user.getUser_id() == league.getTeam17_id()
						|| user.getUser_id() == league.getTeam18_id() || user.getUser_id() == league.getTeam19_id() || user.getUser_id() == league.getTeam20_id())
				{
					myLeagues.add(league);
					model.addAttribute("myLeagues", myLeagues);
				}
			}
		}
        return myLeagues;
    }  
	
	@PostMapping("/addLeague")
    public String createNote(Model model, HttpServletRequest request, @ModelAttribute AddLeagueForm addLeagueForm) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		League league = new League();
		league.setCreated_by_id(user.getUser_id());
		LocalDateTime dateTime = LocalDateTime.now();
		league.setCreated_date(dateTime);
		league.setLeague_name(addLeagueForm.getLeague_name());
		league.setNum_teams_in_league(addLeagueForm.getNum_teams_in_league());
		league.setScoring_type(addLeagueForm.getScoring_type());
		league.setTeam_location(addLeagueForm.getTeam_location());
		league.setNick_name(addLeagueForm.getNick_name());
		league.setAbbreviation(addLeagueForm.getAbbreviation());
		league.setTeam_logo(addLeagueForm.getTeam_logo());
		league.setTeam1_id(user.getUser_id());
		league.setPrivate_league(addLeagueForm.getPrivate_league());
		if(addLeagueForm.getOpt_in_emails() == true)
		{
			league.setOpt_in_emails(addLeagueForm.getOpt_in_emails());
		}
		leagueRepository.save(league);
		model.addAttribute("template", "myLeague");
		model.addAttribute("user", user);
		return "index";
    }
	
	@PostMapping("/deleteLeague/{league_id}")
    public String deleteLeague(@PathVariable(value = "league_id") Integer league_id, Model model, HttpServletRequest request) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
        List<League> leagues = leagueRepository.findAll();
		for(League league : leagues)
		{
			if(league.getLeague_id() == league_id)
			{
//				leagueRepository.delete(league_id);		
			}
		}
		model.addAttribute("template", "myLeague");
		model.addAttribute("user", user);
		return "index";
    }
	
	@PostMapping("/updateLeague/{league_id}") 
    public String updateLeague(@PathVariable(value = "league_id") Integer league_id,
    		@ModelAttribute UpdateLeagueForm updateLeagueForm) 
	{
		try
		{
			List<League> leagues = leagueRepository.findAll();
			for(League league : leagues)
			{
				if(league.getLeague_id() == league_id)
				{
					league.setLeague_name(updateLeagueForm.getLeague_name());
					League updatedLeague = leagueRepository.save(league);		
				}
			}
			
		}
		catch(Exception e)
		{
			
		}
		return "redirect:/leagueDetails/" + league_id;
    }
	
	@GetMapping(value = "/leagueDetails/{league_id}")
	public String leagueDetails(@PathVariable(value = "league_id") Integer league_id, HttpServletRequest request, Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		List<League> leagues = leagueRepository.findAll();
		if(!CollectionUtils.isEmpty(leagues))
		{
			List<League> myLeagues = new ArrayList<League>();
			List<Team> leagueTeams = new ArrayList<Team>();
			Integer numOfTeams = 0;
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
					if(teamsInLeague.size() == league.getNum_teams_in_league())
					{
						model.addAttribute("leagueFull", true);
					}
					else if(teamsInLeague.size() >= numOfTeams)
					{
						model.addAttribute("leagueFilled", true);	
					}
					else
					{
						model.addAttribute("leagueFilled", false);
					}
				}
			}
		}
		model.addAttribute("league_id", league_id);
		model.addAttribute("template", "leagueDetails");
		model.addAttribute("user", user);
		return "index";
	}

	@GetMapping(value = "/joinLeague/{inviteCode}/{league_id}")
	public String joinLeague(@PathVariable(value = "league_id") Integer league_id,
							 @PathVariable(value = "inviteCode") String inviteCode, Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		model.addAttribute("joinLeagueForm", new JoinLeagueForm());
		List<League> leagues = leagueRepository.findAll();
		for(League league : leagues)
		{
			model.addAttribute("leagueId", league.getLeague_id());
			model.addAttribute("leagueName", league.getLeague_name());	
		}
		model.addAttribute("template", "joinLeague");
		model.addAttribute("user", user);
		return "index";
	}
	
	@PostMapping("/joinLeague") 
    public String joinLeague(Model model, @ModelAttribute JoinLeagueForm joinLeagueForm) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		try
		{
			List<League> leagues = leagueRepository.findAll();
			for(League league : leagues)
			{
				if(league.getLeague_id() == joinLeagueForm.getLeague_id())
				{
					if(StringUtils.equals(league.getInvite_code(), joinLeagueForm.getInvite_code()))
					{
						boolean isSet = false;
						if(league.getTeam1_id() == null && !isSet) 
						{
							league.setTeam1_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam2_id() == null && !isSet) 
						{
							league.setTeam2_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam3_id() == null && !isSet) 
						{
							league.setTeam3_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam4_id() == null && !isSet) 
						{
							league.setTeam4_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam5_id() == null && !isSet) 
						{
							league.setTeam5_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam6_id() == null && !isSet) 
						{
							league.setTeam6_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam7_id() == null && !isSet) 
						{
							league.setTeam7_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam8_id() == null && !isSet) 
						{
							league.setTeam8_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam9_id() == null && !isSet) 
						{
							league.setTeam9_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam10_id() == null && !isSet) 
						{
							league.setTeam10_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam11_id() == null && !isSet) 
						{
							league.setTeam11_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam12_id() == null && !isSet) 
						{
							league.setTeam12_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam13_id() == null && !isSet) 
						{
							league.setTeam13_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam14_id() == null && !isSet) 
						{
							league.setTeam14_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam15_id() == null && !isSet) 
						{
							league.setTeam15_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam16_id() == null && !isSet) 
						{
							league.setTeam16_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam17_id() == null && !isSet) 
						{
							league.setTeam17_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam18_id() == null && !isSet) 
						{
							league.setTeam18_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam19_id() == null && !isSet) 
						{
							league.setTeam19_id(user.getUser_id());
							isSet = true;
						}
						if(league.getTeam20_id() == null && !isSet) 
						{
							league.setTeam20_id(user.getUser_id());
							isSet = true;
						}
						
						League updatedLeague = leagueRepository.save(league);		
					}
				}
			}
			
		}
		catch(Exception e)
		{
			
		}
		model.addAttribute("template", "leagueDetails");
		model.addAttribute("user", user);
		return "index";
    }
}