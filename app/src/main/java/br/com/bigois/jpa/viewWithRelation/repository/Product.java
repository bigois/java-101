package br.com.bigois.jpa.viewWithRelation.repository;

import br.com.bigois.jpa.viewWithRelation.converter.TrimTrailingConverter;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "SB1990", schema = "dbo")
public class Product {
	// JPA converters are not supported for identifier attributes,
	// so trailing spaces are removed only when exposing the value
	@Id
	@Column(name = "B1_COD")
	private String code;

	// Removes trailing spaces when reading the value from the database
	@Column(name = "B1_DESC")
	@Convert(converter = TrimTrailingConverter.class)
	private String description;

	// Lombok's @ToString uses getters by default, so the displayed code is trimmed
	// while the original database value remains stored internally
	public String getCode() {
		return code == null ? null : code.stripTrailing();
	}

	// Returns the original value exactly as loaded from the database
	public String getRawCode() {
		return code;
	}
}
