package br.com.bigois.mockitoinject.controller;

import br.com.bigois.mockitoinject.dto.DeviceRequest;
import br.com.bigois.mockitoinject.dto.DeviceResponse;
import br.com.bigois.mockitoinject.service.DeviceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceController {
	private final DeviceService deviceService;

	public DeviceController(DeviceService deviceService) {
		this.deviceService = deviceService;
	}

	@GetMapping
	public ResponseEntity<List<DeviceResponse>> getAllDevices() {
		return ResponseEntity.ok(deviceService.getAllDevices().stream().map(DeviceResponse::new).toList());
	}

	@GetMapping("/{id}")
	public ResponseEntity<DeviceResponse> getDeviceById(@PathVariable Long id) {
		return deviceService.getDeviceById(id)
				.map(DeviceResponse::new)
				.map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<DeviceResponse> createDevice(@RequestBody DeviceRequest request) {
		return ResponseEntity.status(HttpStatus.CREATED).body(deviceService.createDevice(request));
	}
}
