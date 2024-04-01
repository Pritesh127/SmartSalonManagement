package com.smartsalon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginRegisterLanding {

	@GetMapping("/")
	public String landingPage() {
		return "LandingTemplates/landingPage";
	}
	
	@GetMapping("/login")
	public String login() {
		return "LoginTemplates/loginPage";
	}
	
	@GetMapping("/register")
	public String register() {
		return "";
	}
	
	@GetMapping("/verify")
	public String varify() {
		
	
		return "redirect:/homePage";
	}
	
	@GetMapping("/homePage")
	public String homePage() {
		return "HomeTemplates/homePage";
	}
}
