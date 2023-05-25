package com.rhekhienth.phs.mx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String reInicio() {
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public String inicio() {
		return "index";
	}
	
}
