package crudcar.repository;

import crudcar.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepositry extends JpaRepository<Details,Integer> {

}
