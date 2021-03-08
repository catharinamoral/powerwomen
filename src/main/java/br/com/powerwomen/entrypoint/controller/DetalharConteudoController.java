package br.com.powerwomen.entrypoint.controller;

import static br.com.powerwomen.entrypoint.constants.ParametrosEntryPointConstants.ID_MULHER;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.powerwomen.entrypoint.constants.RecursoConstants;
import br.com.powerwomen.usecase.domain.request.DetalharConteudoDomainRequest;
import br.com.powerwomen.usecase.domain.response.DetalharConteudoDomainResponse;
import br.com.powerwomen.usecase.gateway.DetalharConteudoGateway;

@RestController
@RequestMapping(value = RecursoConstants.DETALHAR)
@EnableAutoConfiguration
public class DetalharConteudoController {

	@Autowired
	private DetalharConteudoGateway gateway;
	
	@GetMapping
	public Optional<List<DetalharConteudoDomainResponse>> teste(@PathVariable(ID_MULHER) String idMulher) {
		DetalharConteudoDomainRequest request = DetalharConteudoDomainRequest.builder().idMulher(idMulher).build();
		
		return gateway.listarConteudoGeralPorIdMulher(request);
	}
	
}
