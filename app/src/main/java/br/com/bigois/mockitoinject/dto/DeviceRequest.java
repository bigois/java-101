package br.com.bigois.mockitoinject.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record DeviceRequest(
		@NotBlank(message = "Name is required")
		@Size(min = 2, max = 100)
		String name,

		@NotNull(message = "Price is required")
		@Positive(message = "Price must be positive")
		@Max(value = 10000, message = "Price must be less than or equal to 10000")
		BigDecimal price
) {
}
