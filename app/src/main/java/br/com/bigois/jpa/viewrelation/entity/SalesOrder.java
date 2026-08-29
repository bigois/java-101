package br.com.bigois.jpa.viewrelation.entity;

import br.com.bigois.jpa.viewrelation.entity.types.SalesOrderType;
import br.com.bigois.jpa.viewrelation.id.SalesOrderId;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "SC5990")
@IdClass(SalesOrderId.class)
public class SalesOrder {
	@Id
	@Column(name = "C5_FILIAL")
	private String branch;

	@Id
	@Column(name = "C5_NUM")
	private String code;

	@Column(name = "C5_TIPO")
	@Enumerated(EnumType.STRING)
	private SalesOrderType type;

	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "C5_CLIENTE", referencedColumnName = "A1_COD"),
			@JoinColumn(name = "C5_LOJACLI", referencedColumnName = "A1_LOJA")
	})
	private Customer customer;

	// EAGER is intentional for this example, but it is not the preferred strategy
	@OneToMany(fetch = FetchType.EAGER)
	// @OneToMany join direction: child column -> parent column
	@JoinColumns({
			@JoinColumn(name = "C6_FILIAL", referencedColumnName = "C5_FILIAL"),
			@JoinColumn(name = "C6_NUM", referencedColumnName = "C5_NUM"),
	})
	private List<SalesOrderItem> items;
}
