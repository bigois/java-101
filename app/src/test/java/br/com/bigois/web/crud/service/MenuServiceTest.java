package br.com.bigois.web.crud.service;

import br.com.bigois.web.crud.repository.DishRepository;
import br.com.bigois.web.crud.repository.MenuRepository;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MenuServiceTest {
	private final MenuRepository menus = mock(MenuRepository.class);
	private final DishRepository dishes = mock(DishRepository.class);
	private final MenuService service = new MenuService(menus, dishes);

	@Test
	void shouldReturnEmptyListWhenThereAreNoMenus() {
		when(menus.findAll()).thenReturn(List.of());
		assertEquals(List.of(), service.getMenus());
	}

	@Test
	void shouldRejectMissingMenu() {
		when(menus.findById(1L)).thenReturn(Optional.empty());
		assertThrows(IllegalArgumentException.class, () -> service.getMenuById(1L));
	}
}
