package br.com.bigois.jpa.viewWithRelation.entity;

import br.com.bigois.jpa.viewWithRelation.id.SalesOrderItemId;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "SC6990")
@IdClass(SalesOrderItemId.class)
public class SalesOrderItem {
	@Id
	@Column(name = "C6_FILIAL")
	private String branch;

	@Id
	@Column(name = "C6_NUM")
	private String code;

	@Id
	@Column(name = "C6_ITEM")
	private String sequence;

	@ManyToOne
	@JoinColumn(name = "C6_PRODUTO", referencedColumnName = "B1_COD")
	private Product product;

	// The database column is FLOAT, so Hibernate must use DOUBLE at JDBC level while keeping BigDecimal in Java
	@Column(name = "C6_QTDVEN")
	@JdbcTypeCode(SqlTypes.DOUBLE)
	private BigDecimal quantity;

	@Column(name = "C6_PRCVEN")
	@JdbcTypeCode(SqlTypes.DOUBLE)
	private BigDecimal price;

	@Column(name = "C6_VALOR")
	@JdbcTypeCode(SqlTypes.DOUBLE)
	private BigDecimal total;
}
