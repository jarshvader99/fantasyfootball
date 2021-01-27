package com.ff.fantasyfootball;

import com.ff.fantasyfootball.LeagueRepository;
import com.fasterxml.uuid.Generators;
import com.ff.fantasyfootball.League;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
import org.thymeleaf.util.StringUtils;
import com.ff.fantasyfootball.SendEmailService;

@Controller
public class InviteController {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	LeagueRepository leagueRepository;
	@Autowired
	TeamRepository teamRepository;
	@Autowired
	SendEmailService sendEmailService;
	
	@GetMapping(value = "/invite/{league_id}")
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
					if(StringUtils.isEmpty(league.getInvite_code()))
					{
						UUID uuid2 = Generators.randomBasedGenerator().generate();
						league.setInvite_code(uuid2.toString());
						leagueRepository.save(league);
					}
					model.addAttribute("inviteCode", league.getInvite_code());
					model.addAttribute("teamsInLeague", teamsInLeague);
					model.addAttribute("slottedTeams", teamsInLeague.size());
					if(teamsInLeague.size() == league.getNum_teams_in_league())
					{
						model.addAttribute("canDraft", true);
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
		model.addAttribute("sendInviteEmailForm", new SendInviteForm());
		model.addAttribute("league_id", league_id);
		model.addAttribute("template", "invite");
		model.addAttribute("user", user);
		return "index";
	}

	@PostMapping("/sendInviteEmail")
    public String createNote(Model model, HttpServletRequest request, League league, @ModelAttribute SendInviteForm sendInviteEmailForm) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
        String to = sendInviteEmailForm.getTo();
        String emailBody = sendInviteEmailForm.getEmailBody();
        String inviteCode = sendInviteEmailForm.getInviteCode();
        SendEmailService.main(to, "Join my fantasy football league!", 
        		"<p>You have been invited to join so and so's fantasy football league. "
        		+ "Please click this link to get set up. "
        		+ "<a href='https://localhost:8443/joinLeague/" + inviteCode + "/" + league.getLeague_id() + "'>Join</a>"
        		+ "</p><br/>" + emailBody);
        
		model.addAttribute("template", "myLeague");
		model.addAttribute("user", user);
		return "index";
    }

}