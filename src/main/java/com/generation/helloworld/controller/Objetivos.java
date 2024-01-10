package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("objetivos")
public class Objetivos {
	
	@GetMapping
	public String objetivos(){
		return "Meus objetivos para essa semana são aprender mais sobre Spring e API";
	}
	

}
