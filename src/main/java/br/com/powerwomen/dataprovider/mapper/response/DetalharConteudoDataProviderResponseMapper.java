package br.com.powerwomen.dataprovider.mapper.response;

import java.util.ArrayList;
import java.util.List;

import br.com.powerwomen.dataprovider.repository.entity.DetalharConteudoEntity;
import br.com.powerwomen.usecase.domain.response.DetalharConteudoDomainResponse;

public class DetalharConteudoDataProviderResponseMapper {

	private DetalharConteudoDataProviderResponseMapper() {
	}
	
	public static List<DetalharConteudoDomainResponse> toConteudosDomain(List<DetalharConteudoEntity> detalharConteudoEntity){
		
		List<DetalharConteudoDomainResponse> listaDomainResponse = new ArrayList<>();
		
		if(detalharConteudoEntity != null) {
			for (DetalharConteudoEntity conteudo : detalharConteudoEntity) {
				listaDomainResponse.add(toConteudoDomain(conteudo));
			}
		}
		
		return listaDomainResponse;
	}
	
	private static DetalharConteudoDomainResponse toConteudoDomain(DetalharConteudoEntity conteudoEntity) {
		return DetalharConteudoDomainResponse.builder()
				.ordem(conteudoEntity.getOrdem())
				.conteudo(conteudoEntity.getConteudo())
				.tipo(conteudoEntity.getTipo())
				.build();
	}
}
