package br.com.powerwomen.entrypoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.powerwomen.entrypoint.constants.RecursoConstants;

@RestController
@RequestMapping(value = RecursoConstants.CONTEUDO_GERAL)
public class ListarConteudoGeralController {

	@GetMapping
	public String teste() {
		return "Deu bom";
	}
	
}
