package br.com.bigois.web.crud.service;

import br.com.bigois.web.crud.dto.DishIngredientsDto;
import br.com.bigois.web.crud.dto.MenuDto;
import br.com.bigois.web.crud.dto.MenuDishesDto;
import br.com.bigois.web.crud.repository.DishRepository;
import br.com.bigois.web.crud.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
	private final MenuRepository menuRepository;
	private final DishRepository dishRepository;

	public MenuService(MenuRepository menuRepository, DishRepository dishRepository) {
		this.menuRepository = menuRepository;
		this.dishRepository = dishRepository;
	}

	public List<MenuDto> getMenus() {
		return menuRepository.findAll().stream()
				.map(MenuDto::new)
				.toList();
	}

	public MenuDishesDto getMenuById(Long id) {
		return menuRepository.findById(id)
				.map(menu -> new MenuDishesDto(menu, dishRepository.findByMenuIdAndAvailableTrue(menu.getId())))
				.orElseThrow(() -> new IllegalArgumentException("Menu not found with id " + id));
	}

	public DishIngredientsDto getDishIngredientsByMenuIdAndDishId(Long menuId, Long dishId) {
		return dishRepository.findByMenuIdAndIdAndAvailableTrue(menuId, dishId)
				.map(DishIngredientsDto::new)
				.orElseThrow(() -> new IllegalArgumentException("Dish id " + dishId + " not found in menu id " + menuId + " or it is inactive"));
	}
}
