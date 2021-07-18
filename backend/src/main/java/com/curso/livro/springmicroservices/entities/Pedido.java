package com.curso.livro.springmicroservices.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Getter @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@Getter @Setter private Cliente cliente;
	
	@ManyToMany
	@Cascade(CascadeType.MERGE)
	@Getter @Setter private List<Item> itens;
	
	@DateTimeFormat(iso = ISO.DATE, pattern = "dd-MM-yyyy")
	@Getter @Setter private LocalDate date;
	
	@Min(1)
	@Getter @Setter private Double valorTotal;

}
