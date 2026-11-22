package br.com.bigois.mockitoinject.controller;

import br.com.bigois.mockitoinject.domain.Device;
import br.com.bigois.mockitoinject.dto.DeviceRequest;
import br.com.bigois.mockitoinject.repository.DeviceRepository;
import br.com.bigois.mockitoinject.service.DeviceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

@ExtendWith(MockitoExtension.class)
public class DeviceControllerTest {
	// Inject the DeviceController with the mocked DeviceService
	private DeviceController controller;

	// Mock the DeviceRepository to avoid errors when testing the DeviceController
	@Mock
	private DeviceRepository repository;

	// Capture the Device object passed to the save method of the DeviceRepository
	@Captor
	private ArgumentCaptor<Device> requestCaptor;

	// Set up the DeviceController with the mocked DeviceService before each test
	@BeforeEach
	void setUp() {
		DeviceService service = new DeviceService(repository);
		controller = new DeviceController(service);
	}

	@Test
	void shouldSaveDevice() {
		// Arrange
		DeviceRequest request = new DeviceRequest("Mouse", new BigDecimal("25"));
		BDDMockito.given(repository.save(Mockito.any(Device.class)))
				.willReturn(new Device(request.name(), request.price()));

		// Act
		controller.createDevice(request);

		// Assert
		BDDMockito.then(repository).should().save(requestCaptor.capture());
		Device capturedDevice = requestCaptor.getValue();
		Assertions.assertEquals(request.name(), capturedDevice.getName());
		Assertions.assertEquals(request.price(), capturedDevice.getPrice());
	}
}
