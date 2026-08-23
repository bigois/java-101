package br.com.bigois.jpa.viewWithRelation.repository;

import br.com.bigois.jpa.viewWithRelation.entity.Product;
import br.com.bigois.jpa.viewWithRelation.id.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, ProductId> {
}
