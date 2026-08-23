package br.com.bigois.jpa.viewWithRelation.entity;

import br.com.bigois.jpa.viewWithRelation.id.UnitOfMeasureId;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "SAH990")
@IdClass(UnitOfMeasureId.class)
public class UnitOfMeasure {
	@Id
	@Column(name = "AH_FILIAL")
	private String branch;

	@Id
	@Column(name = "AH_UNIMED")
	private String code;

	@Column(name = "AH_DESCPO")
	private String description;
}
