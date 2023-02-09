package crudcar.repository;

import crudcar.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Cars, Integer> {
}
