package br.com.bigois.web.crud.controller;

import br.com.bigois.web.crud.entity.Dish;
import br.com.bigois.web.crud.repository.DishRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/dishes", produces = MediaType.APPLICATION_JSON_VALUE)
public class DishController {
	private final DishRepository dishRepository;

	public DishController(DishRepository dishRepository) {
		this.dishRepository = dishRepository;
	}

	@GetMapping
	public List<Dish> getDishes() {
		return dishRepository.findAll();
	}
}
