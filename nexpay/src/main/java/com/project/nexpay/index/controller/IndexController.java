package com.project.nexpay.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/*")
public class IndexController {
	
	@GetMapping("/")   
	public String main() {
		
		return "redirect:/index";
	}
	
	
	
}
