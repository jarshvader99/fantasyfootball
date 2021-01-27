package com.ff.fantasyfootball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class PlayersController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping(value = "/players")
	public String players(Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
        
        
        
		model.addAttribute("template", "players");
		model.addAttribute("user", user);
		return "index";
	}
	
	@GetMapping(value = "/playersDetails/{team}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String playersDetails(@PathVariable(name="team") String team, Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
        
		RestTemplate restTemplate = new RestTemplate();
	    ObjectMapper mapper = new ObjectMapper();
	    String result = null;
		
		if(!StringUtils.isEmpty(team))
		{
			final String uri = "https://api.sportsdata.io/v3/nfl/scores/json/Players/" + team + "?key=e416e565fd6c45e6b630e2cf0a7b4931";
			result = restTemplate.getForObject(uri, String.class);
		}
	    
   	    // convert JSON array to List
	    try 
	    {
			List<Player> players = Arrays.asList(mapper.readValue(result, Player[].class));
			model.addAttribute("players", players);
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
	    model.addAttribute("team", team);
	    model.addAttribute("template", "playersTeam");
		model.addAttribute("user", user);
		return "index";
	}
	
	@GetMapping(value = "/playersDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public String playersDetails(Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
        
		RestTemplate restTemplate = new RestTemplate();
	    ObjectMapper mapper = new ObjectMapper();
	    String result = null;
		
			final String uri = "https://api.sportsdata.io/v3/nfl/scores/json/Players?key=e416e565fd6c45e6b630e2cf0a7b4931";
			result = restTemplate.getForObject(uri, String.class);
	    
   	    // convert JSON array to List
	    try 
	    {
			List<Player> players = Arrays.asList(mapper.readValue(result, Player[].class));
			List<Player> qbPlayers = new ArrayList<Player>();
			List<Player> rbPlayers = new ArrayList<Player>();
			List<Player> wrPlayers = new ArrayList<Player>();
			List<Player> tePlayers = new ArrayList<Player>();
			List<Player> kickerPlayers = new ArrayList<Player>();
			for(Player player : players)
			{
				if(player.getActive() && player.getPosition().equals("QB"))
				{
					qbPlayers.add(player);
				}
				if(player.getActive() && player.getPosition().equals("RB"))
				{
					rbPlayers.add(player);
				}
				if(player.getActive() && player.getPosition().equals("WR"))
				{
					wrPlayers.add(player);
				}
				if(player.getActive() && player.getPosition().equals("TE"))
				{
					tePlayers.add(player);
				}
				if(player.getActive() && player.getPosition().equals("K"))
				{
					kickerPlayers.add(player);
				}
				
			}
			model.addAttribute("players", qbPlayers);
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
	    model.addAttribute("template", "playersAll");
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping(value="/playerTable")
    public @ResponseBody List<Player> getPlayers(Model model) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
        
        RestTemplate restTemplate = new RestTemplate();
	    ObjectMapper mapper = new ObjectMapper();
	    String result = null;
		
			final String uri = "https://api.sportsdata.io/v3/nfl/scores/json/Players?key=e416e565fd6c45e6b630e2cf0a7b4931";
			result = restTemplate.getForObject(uri, String.class);
	    
   	    // convert JSON array to List
		List<Player> qbPlayers = new ArrayList<Player>();
	    try 
	    {
			List<Player> players = Arrays.asList(mapper.readValue(result, Player[].class));
			for(Player player : players)
			{
				if(player.getActive() && player.getPosition().equals("QB"))
				{
					qbPlayers.add(player);
				}
			}
			model.addAttribute("players", qbPlayers);
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
        
        return qbPlayers;
    }  
}
