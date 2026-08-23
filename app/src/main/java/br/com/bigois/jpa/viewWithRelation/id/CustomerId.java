package br.com.bigois.jpa.viewWithRelation.id;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CustomerId {
	private String branch;
	private String code;
	private String store;
}
