package br.com.bigois.mockitoinject.dto;

import lombok.NonNull;

import java.math.BigDecimal;

public record DeviceRequest(@NonNull String name, @NonNull BigDecimal price) {
}
