package br.com.bigois.mapper.simple;

import br.com.bigois.mapper.EntityMapper;

public class SimpleMapperApp {
	public static void main(String[] args) {
		EntityMapper mapper = new EntityMapper();
		String json = """
					{
					  "cep": "06783-200",
					  "logradouro": "Rua Gomer Bento de Albuquerque",
					  "complemento": "",
					  "unidade": "",
					  "bairro": "Jardim Record",
					  "localidade": "Vila da Serra",
					  "uf": "SP",
					  "estado": "Rio de Janeiro",
					  "regiao": "Sudeste",
					  "ibge": "3552809",
					  "gia": "6750",
					  "ddd": "11",
					  "siafi": "7157"
					}
				""";

		Address address = mapper.mapEntity(json, Address.class);
		System.out.println("Street: " + address.street());
		System.out.println("City: " + address.city());
		System.out.println("Neighborhood: " + address.neighborhood());
		System.out.println("State: " + address.state());
	}
}
