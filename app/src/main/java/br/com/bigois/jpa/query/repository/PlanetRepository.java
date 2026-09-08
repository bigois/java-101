package br.com.bigois.jpa.query.repository;

import br.com.bigois.jpa.query.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
	@Query(value = "SELECT * FROM planets ORDER BY moon_count DESC LIMIT 1", nativeQuery = true)
	Planet getBiggerPlanetWithNativeQuery();

	@Query("SELECT p FROM Planet p ORDER BY p.size ASC LIMIT 1")
	Planet getSmallerPlanetWithJpql();

	@Query("SELECT p FROM Planet p WHERE p.moonCount > :moonCount")
	List<Planet> getPlanetsWithMoonCountGreaterThan(Integer moonCount);
}
