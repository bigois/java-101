package br.com.bigois.jpa.viewrelation.entity;

import br.com.bigois.jpa.viewrelation.converter.TrimTrailingConverter;
import br.com.bigois.jpa.viewrelation.id.ProductId;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "SB1990")
@IdClass(ProductId.class)
public class Product {
	// JPA converters are not supported for identifier attributes,
	// so trailing spaces are removed only when exposing the value
	@Id
	@Column(name = "B1_FILIAL")
	private String branch;

	@Id
	@Column(name = "B1_COD")
	private String code;

	// Removes trailing spaces when reading the value from the database
	@Column(name = "B1_DESC")
	@Convert(converter = TrimTrailingConverter.class)
	private String description;

	// @ManyToOne join direction: parent column -> child column
	@ManyToOne
	@JoinColumn(name = "B1_UM", referencedColumnName = "AH_UNIMED")
	private UnitOfMeasure unitOfMeasure;
}
