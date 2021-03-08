package br.com.powerwomen.usecase.gateway;

import java.util.List;
import java.util.Optional;

import br.com.powerwomen.usecase.domain.request.DetalharConteudoDomainRequest;
import br.com.powerwomen.usecase.domain.response.DetalharConteudoDomainResponse;

public interface DetalharConteudoGateway {

	Optional<List<DetalharConteudoDomainResponse>> listarConteudoGeralPorIdMulher(
			DetalharConteudoDomainRequest detalharConteudoDomainRequest);
	
}
