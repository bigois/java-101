package br.com.bigois.mockitoinject.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Getter
@Entity
@Table(name = "devices")
public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private BigDecimal price;

	protected Device() {
	}

	public Device(@NonNull String name, @NonNull BigDecimal price) {
		this.name = name;
		this.price = price;
	}
}
