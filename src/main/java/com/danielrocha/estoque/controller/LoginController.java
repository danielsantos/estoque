package com.danielrocha.estoque.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	private static final String LOGIN_VIEW = "/login/login";
	
	@RequestMapping(value = "/login")
	public String autenticar(@AuthenticationPrincipal User user){
		if (user != null) {
			return "redirect:/users";
		}
		return LOGIN_VIEW;
	}
	
}
