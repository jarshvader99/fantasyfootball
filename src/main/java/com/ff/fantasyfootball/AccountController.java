package com.ff.fantasyfootball;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/account")
	public String account(HttpServletRequest request, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();

        User user = userRepository.findByUsername(userDetail.getUsername());
        request.getSession().setAttribute("userId", user.getUser_id());
        
        
        
        model.addAttribute("template", "account");
        model.addAttribute("user", user);
		return "index";
	}
	
}