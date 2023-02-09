package crudcar.repository;

import crudcar.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufactureRepository extends JpaRepository<Manufacturer,Integer> {
}
