package com.springweb.springweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

@WebMvcTest //Utilizada para realizar teste de requisições no controller, ou qualquer uma do tipo REST
@ExtendWith(SpringExtension.class)
public class TesteIntegrationController {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testIntegration() throws Exception{
		RequestBuilder requisicao = get("/"); //URL da requisição
		MvcResult resultado = mvc.perform(requisicao).andReturn();
		assertEquals("Bem vindo Bruno Primeiro projeto Web utilizando o Spring Boot Web", resultado.getResponse().getContentAsString());
	}

	@Test
	public void testIntegrationWithArgs() throws Exception{
		mvc.perform(get("/?nome=Joao"))
		.andExpect((ResultMatcher) content().string("Bem vindo Joao Primeiro projeto Web utilizando o Spring Boot Web"));
	}
}


