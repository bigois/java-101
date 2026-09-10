package br.com.bigois.web.crud.controller;

import br.com.bigois.web.crud.dto.DishIngredientsDTO;
import br.com.bigois.web.crud.dto.MenuDTO;
import br.com.bigois.web.crud.dto.MenuDishesDTO;
import br.com.bigois.web.crud.service.MenuService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/menus", produces = MediaType.APPLICATION_JSON_VALUE)
public class MenuController {
	private final MenuService menuService;

	public MenuController(MenuService menuService) {
		this.menuService = menuService;
	}

	@GetMapping
	public List<MenuDTO> getMenus() {
		return menuService.getMenus();
	}

	@GetMapping("/{id}/dishes")
	public MenuDishesDTO getMenuById(@PathVariable Long id) {
		return menuService.getMenuById(id);
	}

	@GetMapping("/{menuId}/dishes/{dishId}")
	public DishIngredientsDTO getDishIngredientsByMenuIdAndDishId(@PathVariable Long menuId, @PathVariable Long dishId) {
		return menuService.getDishIngredientsByMenuIdAndDishId(menuId, dishId);
	}
}
