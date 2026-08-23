package br.com.bigois.jpa.viewWithRelation;

import br.com.bigois.jpa.viewWithRelation.repository.Product;
import br.com.bigois.jpa.viewWithRelation.repository.ProductRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ViewWithRelationApp implements ApplicationRunner {
	private final ProductRepository productRepository;

	public ViewWithRelationApp(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ViewWithRelationApp.class, args);
	}

	@Override
	public void run(@NonNull ApplicationArguments args) {
		List<Product> products = productRepository.findAll();
		System.out.println("Total products: " + products.size());
		System.out.println(products);
	}
}
