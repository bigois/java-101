package br.com.bigois.mapper.dto;

import br.com.bigois.io.FileReaderService;
import br.com.bigois.mapper.EntityMapper;

import java.io.IOException;

public class DtoMapperApp {
	public static void main(String[] args) {
		EntityMapper mapper = new EntityMapper();

		try {
			String menuData = FileReaderService.readWithInputStream("menu.json");
			MenuDto menuDto = mapper.mapEntity(menuData, MenuDto.class);
			System.out.println(menuDto);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
