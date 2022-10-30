package com.springweb.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

		@GetMapping("/")
		public String mensagem() {
			return "Primeiro projeto Web utilizando o Spring Boot Web";
		}
}
