package com.ff.fantasyfootball;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class NewsController {
	
	@GetMapping(value = "/news", produces = MediaType.APPLICATION_JSON_VALUE)
	public String schedules(Model model) 
	{
		final String uri = "https://api.sportsdata.io/v3/nfl/scores/json/News?key=e416e565fd6c45e6b630e2cf0a7b4931";
	    RestTemplate restTemplate = new RestTemplate();
	    ObjectMapper mapper = new ObjectMapper();
	    String result = restTemplate.getForObject(uri, String.class);
   	    // convert JSON array to List
	    try 
	    {
			List<News> news = Arrays.asList(mapper.readValue(result, News[].class));
			model.addAttribute("news", news);
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
		return "news";
	}
}
