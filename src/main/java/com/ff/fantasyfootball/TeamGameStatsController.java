package com.ff.fantasyfootball;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class TeamGameStatsController {
	
	@Autowired 
	UserRepository userRepository;
	
	@GetMapping(value = "/gameStats", produces = MediaType.APPLICATION_JSON_VALUE)
	public String schedules(Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
		final String uri = "https://api.sportsdata.io/v3/nfl/scores/json/TeamGameStats/2019REG/1?key=e416e565fd6c45e6b630e2cf0a7b4931";
	    RestTemplate restTemplate = new RestTemplate();
	    ObjectMapper mapper = new ObjectMapper();
	    String result = restTemplate.getForObject(uri, String.class);
   	    // convert JSON array to List
	    try 
	    {
			List<TeamGameStats> gameStats = Arrays.asList(mapper.readValue(result, TeamGameStats[].class));
			model.addAttribute("gameStats", gameStats);
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
	    model.addAttribute("template", "gameStats");
	    model.addAttribute("user", user);
		return "index";
	}
}
