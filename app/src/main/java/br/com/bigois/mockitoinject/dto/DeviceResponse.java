package br.com.bigois.mockitoinject.dto;

import br.com.bigois.mockitoinject.domain.Device;

import java.math.BigDecimal;

public record DeviceResponse(
		Long id,
		String name,
		BigDecimal price
) {
	public DeviceResponse(Device device) {
		this(device.getId(), device.getName(), device.getPrice());
	}
}
