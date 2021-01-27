package com.ff.fantasyfootball;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HomeController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MoviesRepository moviesRepository;
	
	@RequestMapping("/")
	public String index(HttpServletRequest request, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        final String uri = "https://api.sportsdata.io/v3/nfl/scores/json/News?key=e416e565fd6c45e6b630e2cf0a7b4931";
	    RestTemplate restTemplate = new RestTemplate();
	    ObjectMapper mapper = new ObjectMapper();
	    String result = restTemplate.getForObject(uri, String.class);
   	    // convert JSON array to List
//	    try 
//	    {
//			List<News> news = Arrays.asList(mapper.readValue(result, News[].class));
//			model.addAttribute("news", news);
//			List<News> headlines = new ArrayList<News>();
//			int count = 0;
//			for(News newsStory : news)
//			{
//				if(count < 3) 
//				{
//					headlines.add(newsStory);
//					count++;
//				}
//				else
//				{
//					break;
//				}
//			}
//			model.addAttribute("headlines", headlines);
//		} 
//	    catch (JsonMappingException e) 
//	    {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//	    catch (JsonProcessingException e) 
//	    {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        model.addAttribute("template", "home");
        model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("/export")
	public String export(HttpServletRequest request, Model model) throws IOException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
	    ExportToZipFileService.export();
        
        model.addAttribute("template", "home");
        model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("/writeToCSV")
	public String writeToCSV(HttpServletRequest request, Model model) throws IOException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        String filePath = "C:/Users/Student/Documents/testing.csv";
	    WriteCSVData.writeDataAtOnce(filePath);
        
        model.addAttribute("template", "home");
        model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("/createExcel")
	public String createExcel(HttpServletRequest request, Model model) throws IOException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        String filePath = "C:/Users/Student/Documents/testing.csv";
	    WriteCSVData.writeDataAtOnce(filePath);
        
        model.addAttribute("template", "home");
        model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("/getAuthToken")
	public String getAuthToken(HttpServletRequest request, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        final String uri = "https://api.themoviedb.org/3/authentication/token/new?api_key=c117030b5d5fffc4d32c4c0412a74c61";
	    RestTemplate restTemplate = new RestTemplate();
	    ObjectMapper mapper = new ObjectMapper();
	    String result = restTemplate.getForObject(uri, String.class);
	    String authTokenTemporaryRequestToken = null;
   	    // convert JSON array to List
	    try 
	    {
			AuthTokenNew authTokenNew = mapper.readValue(result, AuthTokenNew.class);
			authTokenTemporaryRequestToken = authTokenNew.getRequestToken();
			model.addAttribute("requestToken", authTokenTemporaryRequestToken);
			
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
        
        model.addAttribute("user", user);
		return "redirect://www.themoviedb.org/authenticate/" + authTokenTemporaryRequestToken + "?redirect_to=https://localhost:8443/authenticated";
	}
	
	
    
    @RequestMapping("/authenticated")
	public String authenticated(@RequestParam(name="request_token") String sessionId, HttpServletRequest request, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        final String uri = "https://api.themoviedb.org/3/authentication/session/new?api_key=c117030b5d5fffc4d32c4c0412a74c61&request_token=" + sessionId ;
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
        String result = restTemplate.getForObject(uri, String.class);
        
        try {
        	SessionResponse response = mapper.readValue(result, SessionResponse.class);
        	sessionId = response.getSessionId();
        	model.addAttribute("sessionId", sessionId);
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
        
        model.addAttribute("template", "home");
        model.addAttribute("user", user);
		return "index";
	}
    
    @RequestMapping("/logoutOfMovieDB")
	public String logoutOfMovieDB(@RequestParam(name="session_id") String sessionId, HttpServletRequest request, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        final String uri = "https://api.themoviedb.org/3/authentication/session?api_key=c117030b5d5fffc4d32c4c0412a74c61&session_id=" + sessionId;
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
        String result = restTemplate.getForObject(uri, String.class);
        
        try {
        	SessionResponse response = mapper.readValue(result, SessionResponse.class);
        	sessionId = response.getSessionId();
        	model.addAttribute("sessionId", sessionId);
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
        
        model.addAttribute("template", "home");
        model.addAttribute("user", user);
		return "index";
	}

	@RequestMapping("/getMovieDetails")
	public String getMovieDetails(HttpServletRequest request, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        final String uri = "https://api.themoviedb.org/3/movie/123?api_key=c117030b5d5fffc4d32c4c0412a74c61&language=en-US";
	    RestTemplate restTemplate = new RestTemplate();
	    ObjectMapper mapper = new ObjectMapper();
	    String result = restTemplate.getForObject(uri, String.class);
   	    // convert JSON array to List
	    try 
	    {
			MovieDetails movie = mapper.readValue(result, MovieDetails.class);
			model.addAttribute("movie", movie);
			List<Genre> genres = new ArrayList<>();
			for(Genre genre : movie.getGenres())
			{
				genres.add(genre);
				model.addAttribute("genres", genres);
			}
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
        
        model.addAttribute("template", "movieDetails");
        model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("/getPopular")
	public String getPopular(@RequestParam(name="page") String page, HttpServletRequest request, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        final String uri = "https://api.themoviedb.org/3/movie/popular?api_key=c117030b5d5fffc4d32c4c0412a74c61&language=en-US&page=" + page;
	    RestTemplate restTemplate = new RestTemplate();
	    ObjectMapper mapper = new ObjectMapper();
	    String result = restTemplate.getForObject(uri, String.class);
   	    // convert JSON array to List
	    try 
	    {
			Popular popular = mapper.readValue(result, Popular.class);
			model.addAttribute("popular", popular);
			List<Result> results = new ArrayList<>();
			for(Result detailInResult : popular.getResults())
			{
				results.add(detailInResult);
				model.addAttribute("results", results);
			}
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
        
        model.addAttribute("template", "popularMovies");
        model.addAttribute("user", user);
		return "index";
	}
	@Transactional
	@RequestMapping(value="/likeMovie", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String likeMovie(@RequestParam(name="movieId") Integer movieId, 
											HttpServletRequest request, HttpServletResponse response, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        Movies movie = new Movies();
        movie.setMovie_id(movieId);
        movie.setLiked(true);
        movie.setUser_id(user.getUser_id());
        
        moviesRepository.save(movie);
        response.setStatus(200);
        
        
        model.addAttribute("user", user);
        
        return response.toString();
	}
	
	@RequestMapping(value="/dislikeMovie")
	public @ResponseBody String dislikeMovie(@RequestParam(name="movieId") Integer movieId, HttpServletRequest request, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        
        
        moviesRepository.deleteById(movieId);
        
        model.addAttribute("user", user);
        
        return "";
	}
}