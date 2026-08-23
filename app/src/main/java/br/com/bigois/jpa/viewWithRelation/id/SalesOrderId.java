package br.com.bigois.jpa.viewWithRelation.id;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SalesOrderId {
	private String branch;
	private String code;
}
