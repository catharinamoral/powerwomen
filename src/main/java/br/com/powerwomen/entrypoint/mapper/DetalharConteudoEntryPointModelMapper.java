package br.com.powerwomen.entrypoint.mapper;

import java.util.List;
import java.util.stream.Collectors;

import br.com.powerwomen.commons.model.DataModelResponse;
import br.com.powerwomen.entrypoint.controller.DetalharConteudoDTO;
import br.com.powerwomen.usecase.domain.response.DetalharConteudoDomainResponse;

public class DetalharConteudoEntryPointModelMapper {

	public static DataModelResponse<List<DetalharConteudoDTO>> toDetalharConteudoDTO(List<DetalharConteudoDomainResponse> conteudoDomainResponses){
		
		List<DetalharConteudoDTO> conteudoDTOs = conteudoDomainResponses.stream()
				.map(conteudo -> DetalharConteudoDTO.builder()
						.conteudo(conteudo.getConteudo())
						.ordem(conteudo.getOrdem())
						.tipo(conteudo.getTipo())
						.build())
				.collect(Collectors.toList());
		
		DataModelResponse<List<DetalharConteudoDTO>> dataModelResponse = new DataModelResponse<>();
		dataModelResponse.setData(conteudoDTOs);
		return dataModelResponse;
	}
	
}
