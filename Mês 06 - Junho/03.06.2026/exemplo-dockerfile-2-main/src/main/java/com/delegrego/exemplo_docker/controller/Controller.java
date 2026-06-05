package com.delegrego.exemplo_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping
	public String helloWorld() {
		return "A aplicação rodou!";
	}

}
