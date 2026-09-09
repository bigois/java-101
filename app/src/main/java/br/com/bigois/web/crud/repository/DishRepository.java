package br.com.bigois.web.crud.repository;

import br.com.bigois.web.crud.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
