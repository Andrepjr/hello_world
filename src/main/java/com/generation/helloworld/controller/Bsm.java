package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bsm")
public class Bsm {
	
	@GetMapping
	public String bsm(){
		return "Orientação ao futuro\r\n"
				+ "Persistência\r\n"
				+ "Responsabilidade pessoal\r\n"
				+ "Orientação ao detalhe\r\n"
				+ "Trabalho em equipe\r\n"
				+ "Proatividade\r\n"
				+ "Comunicação";
	}

}
