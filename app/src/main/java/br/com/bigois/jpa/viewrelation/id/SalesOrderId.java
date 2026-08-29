package br.com.bigois.jpa.viewrelation.id;

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
