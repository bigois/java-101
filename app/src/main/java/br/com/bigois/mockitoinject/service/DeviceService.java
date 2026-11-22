package br.com.bigois.mockitoinject.service;

import br.com.bigois.mockitoinject.domain.Device;
import br.com.bigois.mockitoinject.dto.DeviceRequest;
import br.com.bigois.mockitoinject.dto.DeviceResponse;
import br.com.bigois.mockitoinject.repository.DeviceRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {
	private final DeviceRepository deviceRepository;

	public DeviceService(@NonNull DeviceRepository deviceRepository) {
		this.deviceRepository = deviceRepository;
	}

	public Optional<Device> getDeviceById(@NonNull Long id) {
		return deviceRepository.findById(id);
	}

	public List<Device> getAllDevices() {
		return deviceRepository.findAll();
	}

	public DeviceResponse createDevice(@NonNull DeviceRequest request) {
		Device device = deviceRepository.save(new Device(request.name(), request.price()));
		return new DeviceResponse(device);
	}
}
