package br.com.powerwomen.dataprovider.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAB_DES_WOM")
public class DetalharConteudoEntity implements Serializable{

	private static final long serialVersionUID = 32005650209786185L;

	@Id
	@Column(name = "IDT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NaturalId
	@Column(name = "IDT_WON")
	private String idMulher;
	
	@Column(name = "CONT")
	private String conteudo;
	
	@Column(name = "ORD")
	private Integer ordem;
	
	@Column(name = "TIP")
	private String tipo;
}
