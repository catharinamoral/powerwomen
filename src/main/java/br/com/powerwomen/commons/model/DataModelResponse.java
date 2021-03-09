package br.com.powerwomen.commons.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataModelResponse<T> {

	private T data;
}
