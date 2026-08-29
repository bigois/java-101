package br.com.bigois.jpa.viewrelation.repository;

import br.com.bigois.jpa.viewrelation.entity.Product;
import br.com.bigois.jpa.viewrelation.id.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, ProductId> {
}
