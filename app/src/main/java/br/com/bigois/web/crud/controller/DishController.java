package br.com.bigois.web.crud.controller;

import br.com.bigois.web.crud.dto.DishDTO;
import br.com.bigois.web.crud.service.DishService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/dishes", produces = MediaType.APPLICATION_JSON_VALUE)
public class DishController {
	private final DishService dishService;

	public DishController(DishService dishService) {
		this.dishService = dishService;
	}

	@GetMapping
	public List<DishDTO> getDishes() {
		return dishService.getDishes();
	}
}
