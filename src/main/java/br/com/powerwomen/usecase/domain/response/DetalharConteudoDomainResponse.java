package br.com.powerwomen.usecase.domain.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DetalharConteudoDomainResponse {

	private Integer ordem;
	private String conteudo;
	private String tipo;
}
