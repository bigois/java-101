package br.com.bigois.mockitoinject;

import br.com.bigois.mockitoinject.domain.Device;
import br.com.bigois.mockitoinject.service.DeviceService;
import lombok.NonNull;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MockitoInjectApp implements ApplicationRunner {
	private final DeviceService deviceService;

	MockitoInjectApp(@NonNull DeviceService deviceService) {
		this.deviceService = deviceService;
	}

	public static void main(String[] args) {
		SpringApplication.run(MockitoInjectApp.class, args);
	}

	@Override
	public void run(@NonNull ApplicationArguments args) throws Exception {
		Optional<Device> deviceById = deviceService.getDeviceById(1L);
		deviceById.ifPresent(d -> System.out.println("Device ID 1: " + d));

		List<Device> allDevices = deviceService.getAllDevices();
		System.out.println("All Devices:");
		allDevices.forEach(d -> System.out.println("> " + d));
	}
}
