package com.expertostech.apirest.tutorialrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		//anotação que indica que esta classe é um controller
public class StatusController {

	@GetMapping(path = "/api/status")		//indica que este será um método executado com uma requisição
	public String check() {
		return "online";
	}
}
