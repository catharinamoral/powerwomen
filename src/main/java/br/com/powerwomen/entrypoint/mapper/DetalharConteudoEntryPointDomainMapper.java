package br.com.powerwomen.entrypoint.mapper;

import br.com.powerwomen.usecase.domain.request.DetalharConteudoDomainRequest;

public class DetalharConteudoEntryPointDomainMapper {

	public static DetalharConteudoDomainRequest fromDomain(String idMulher) {
		return DetalharConteudoDomainRequest.builder()
				.idMulher(idMulher)
				.build();
	}
}
