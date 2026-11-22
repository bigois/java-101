package br.com.bigois.mockitoinject.controller;

import br.com.bigois.mockitoinject.service.DeviceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.then;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// @WebMvcTest is used to test the DeviceController in isolation, without loading the entire Spring application context
@WebMvcTest(DeviceController.class)
class DeviceControllerWebTest {
	// Inject the MockMvc to perform HTTP requests in the test
	@Autowired
	private MockMvc mockMvc;

	// @MockitoBean is used to create a mock of the DeviceService and inject it into the application context
	@MockitoBean
	private DeviceService service;

	@Test
	void shouldNotSaveDeviceWithNegativePrice() throws Exception {
		// Arrange
		String json = """
				{
					"name": "Mouse",
					"price": -25
				}
				""";

		// Act & Assert
		mockMvc.perform(post("/devices")
						.content(json)
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isBadRequest());

		then(service).shouldHaveNoInteractions();
	}
}
