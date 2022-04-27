package com.Halloword.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")

public class HalloController {
	
	@GetMapping
	public String hallo() {
		return "Hallo Generation!!!";
		
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "EstouLivre!!!";
			
		
	}
	
}
