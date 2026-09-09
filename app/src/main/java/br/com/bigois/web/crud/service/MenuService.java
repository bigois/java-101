package br.com.bigois.web.crud.service;

import br.com.bigois.web.crud.dto.MenuDTO;
import br.com.bigois.web.crud.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
	private final MenuRepository menuRepository;

	public MenuService(MenuRepository menuRepository) {
		this.menuRepository = menuRepository;
	}

	public List<MenuDTO> getMenus() {
		return menuRepository.findAll().stream()
				.map(MenuDTO::new)
				.toList();
	}
}
