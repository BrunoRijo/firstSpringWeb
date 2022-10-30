package com.springweb.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

		@GetMapping("/")
		public String mensagem(@RequestParam(name="nome", defaultValue = "Bruno") String mensagem) {
			return String.format("Bem vindo %s Primeiro projeto Web utilizando o Spring Boot Web", mensagem);
		}
}
