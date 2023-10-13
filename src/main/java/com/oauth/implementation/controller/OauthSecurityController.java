package com.oauth.implementation.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OauthSecurityController {
//	@GetMapping("/auth")
//	public String getRequest(Principal user) {
//		return "welcome";
//	}

	@GetMapping("/auth")
	public String getRequest(Principal principal) {
		return "welcome";
	}

	@GetMapping("/login")
	public String getLogin(){
		return "welcome";
	}
}
