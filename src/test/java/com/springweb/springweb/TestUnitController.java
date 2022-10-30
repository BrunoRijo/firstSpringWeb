package com.springweb.springweb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestUnitController {
	
	@Test
	public void testUnit() {
		Controller controller = new Controller();
		String result = controller.mensagem("Bruno"); 
		assertEquals("Bem vindo Bruno Primeiro projeto Web utilizando o Spring Boot Web", result);
	}

}
