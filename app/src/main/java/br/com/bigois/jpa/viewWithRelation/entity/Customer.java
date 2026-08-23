package br.com.bigois.jpa.viewWithRelation.entity;

import br.com.bigois.jpa.viewWithRelation.converter.TrimTrailingConverter;
import br.com.bigois.jpa.viewWithRelation.entity.types.CustomerType;
import br.com.bigois.jpa.viewWithRelation.id.CustomerId;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "SA1990")
@IdClass(CustomerId.class)
public class Customer {
	@Id
	@Column(name = "A1_FILIAL")
	private String branch;

	@Id
	@Column(name = "A1_COD")
	private String code;

	@Id
	@Column(name = "A1_LOJA")
	private String store;

	@Column(name = "A1_NOME")
	@Convert(converter = TrimTrailingConverter.class)
	private String name;

	@Column(name = "A1_PESSOA")
	@Enumerated(EnumType.STRING)
	private CustomerType personType;
}
