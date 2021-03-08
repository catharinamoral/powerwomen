package br.com.powerwomen.dataprovider.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.powerwomen.dataprovider.mapper.response.DetalharConteudoDataProviderResponseMapper;
import br.com.powerwomen.dataprovider.repository.DetalharConteudoRepository;
import br.com.powerwomen.usecase.domain.request.DetalharConteudoDomainRequest;
import br.com.powerwomen.usecase.domain.response.DetalharConteudoDomainResponse;
import br.com.powerwomen.usecase.gateway.DetalharConteudoGateway;


@Component
public class DetalharConteudoDataProvider implements DetalharConteudoGateway{

	@Autowired
	private DetalharConteudoRepository detalharConteudoRepository;
	
	@Override
	public Optional<List<DetalharConteudoDomainResponse>> listarConteudoGeralPorIdMulher(
			DetalharConteudoDomainRequest detalharConteudoDomainRequest){
		
		return this.detalharConteudoRepository.findByIdMulherOrderByOrdemAsc(detalharConteudoDomainRequest.getIdMulher())
				.map(DetalharConteudoDataProviderResponseMapper::toConteudosDomain);
	}
}
