package br.com.powerwomen.entrypoint.controller;

import static br.com.powerwomen.entrypoint.constants.ParametrosEntryPointConstants.ID_MULHER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import br.com.powerwomen.commons.model.DataModelResponse;
import br.com.powerwomen.entrypoint.constants.RecursoConstants;
import br.com.powerwomen.entrypoint.mapper.DetalharConteudoEntryPointDomainMapper;
import br.com.powerwomen.entrypoint.mapper.DetalharConteudoEntryPointModelMapper;
import br.com.powerwomen.usecase.DetalharConteudoUseCase;
import br.com.powerwomen.usecase.domain.request.DetalharConteudoDomainRequest;

@RestController
@RequestMapping(value = RecursoConstants.DETALHAR)
@EnableAutoConfiguration
public class DetalharConteudoController {

	@Autowired
	private DetalharConteudoUseCase detalharConteudoUseCase;
	
	@GetMapping
	public ResponseEntity<DataModelResponse<List<DetalharConteudoDTO>>> detalharConteudo(@PathVariable(ID_MULHER) String idMulher) {
		DetalharConteudoDomainRequest detalharConteudoDomainRequest = DetalharConteudoEntryPointDomainMapper.fromDomain(idMulher);
		
		return detalharConteudoUseCase.detalharConteudo(detalharConteudoDomainRequest)
				.map(DetalharConteudoEntryPointModelMapper::toDetalharConteudoDTO)
				.map(conteudos -> new ResponseEntity<>(conteudos, HttpStatus.OK))
				.orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
	}
	
}
