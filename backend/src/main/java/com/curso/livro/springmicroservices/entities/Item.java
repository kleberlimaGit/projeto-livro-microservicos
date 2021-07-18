package com.curso.livro.springmicroservices.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Length(min=2
		,max=30
		,message="O	tamanho	do	nome	deve	ser	entre	{min}	e	{max} caracteres")
	@Getter
	@Setter
	private String nome;
	
	@NotNull
	@Min(value=20,message="O	valor	mínimo	deve	ser	{value}	reais")
	@Getter
	@Setter
	private Double preco;
}
