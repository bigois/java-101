package br.com.bigois.jpa.viewrelation.id;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SalesOrderItemId {
	private String branch;
	private String code;
	private String sequence;
}
