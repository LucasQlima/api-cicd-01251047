package com.cicd.aula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	public static final String MENSAGEM = "API CI/CD 01251047 - versao 1";

	@GetMapping
	public String hello() {
		return MENSAGEM;
	}

}
