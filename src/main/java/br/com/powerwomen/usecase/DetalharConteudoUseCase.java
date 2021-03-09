package br.com.powerwomen.usecase;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.powerwomen.usecase.domain.request.DetalharConteudoDomainRequest;
import br.com.powerwomen.usecase.domain.response.DetalharConteudoDomainResponse;
import br.com.powerwomen.usecase.gateway.DetalharConteudoGateway;

@Component
public class DetalharConteudoUseCase {

	@Autowired
	private DetalharConteudoGateway detalharConteudoGateway;
	
	public Optional<List<DetalharConteudoDomainResponse>> detalharConteudo(DetalharConteudoDomainRequest detalharConteudoDomainRequest){
		return detalharConteudoGateway.listarConteudoGeralPorIdMulher(detalharConteudoDomainRequest);
	}
}
