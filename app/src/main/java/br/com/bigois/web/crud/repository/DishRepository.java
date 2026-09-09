package br.com.bigois.web.crud.repository;

import br.com.bigois.web.crud.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
	List<Dish> findByAvailableTrue();
}
