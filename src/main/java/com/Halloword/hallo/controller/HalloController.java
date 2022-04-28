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
		return 
				"BSM-0: Introdução às Habilidades Comportamentais e Mentalidades <br/ > BSM-GM: Mentalidade de Crescimento <br/ > BSM-P: Persistência <br/ > BSM-PR: Responsabilidade Pessoal \r\n"
                + "<br/ > BSM-FO: Orientação ao Futuro <br/ > BSM-C: Comunicação <br/ > BSM-OD: Orientação ao Detalhe <br/ > BSM-PA: Proatividade <br/ > BSM-T: Trabalho em Equipe";

	}
	
	@GetMapping("/meus_objetivos")
	public String meus_objetivos() {
		return 
				
				"Estudadar mais<br/ >"
				+"Aperfeiçando mais<br/ >"+
				"Aprendendo mais<br/ >"
				+"Focar mais nos meus objetivos<br/ >";
				
	}
}
