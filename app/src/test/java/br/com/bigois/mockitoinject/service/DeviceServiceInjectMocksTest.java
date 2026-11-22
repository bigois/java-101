package br.com.bigois.mockitoinject.service;

import br.com.bigois.mockitoinject.domain.Device;
import br.com.bigois.mockitoinject.repository.DeviceRepository;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Use the MockitoExtension to enable Mockito annotations to work with JUnit 5
@ExtendWith(MockitoExtension.class)
class DeviceServiceInjectMocksTest {
	// Mock the DeviceRepository to avoid errors when testing the DeviceService
	@Mock
	private DeviceRepository repository;

	// Inject the DeviceService with the mocked DeviceRepository
	@InjectMocks
	private DeviceService service;

	// Mock the Device objects to avoid errors when testing the DeviceService
	@Mock
	private Device deviceID1;

	@Test
	void shouldFindDeviceById() {
		Long deviceId = 1L;
		BDDMockito.given(service.getDeviceById(deviceId)).willReturn(Optional.of(deviceID1));

		Optional<Device> deviceById = service.getDeviceById(deviceId);
		assertTrue(deviceById.isPresent());
	}

	@Test
	void shouldFindThreeDevices() {
		List<Device> deviceList = List.of(
				Mockito.mock(Device.class),
				Mockito.mock(Device.class),
				Mockito.mock(Device.class)
		);
		BDDMockito.given(service.getAllDevices()).willReturn(deviceList);

		int deviceCount = service.getAllDevices().size();
		assertEquals(3, deviceCount);
	}

	@Test
	void shouldThrowExceptionWhenDeviceNotFound() {
		Long deviceId = 2L;
		BDDMockito.given(service.getDeviceById(deviceId)).willThrow(
				new EntityNotFoundException("Device ID " + deviceId + " not found"));

		Optional<Device> deviceById = service.getDeviceById(deviceId);
		assertTrue(deviceById.isEmpty());
	}
}
