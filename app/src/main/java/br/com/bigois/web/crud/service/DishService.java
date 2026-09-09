package br.com.bigois.web.crud.service;

import br.com.bigois.web.crud.dto.DishDTO;
import br.com.bigois.web.crud.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
	private final DishRepository dishRepository;

	public DishService(DishRepository dishRepository) {
		this.dishRepository = dishRepository;
	}

	public List<DishDTO> getDishes() {
		return dishRepository.findByAvailableTrue().stream()
				.map(DishDTO::new)
				.toList();
	}
}
