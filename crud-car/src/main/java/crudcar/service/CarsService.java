package crudcar.service;

import crudcar.entity.Cars;
import crudcar.entity.Details;
import crudcar.entity.Location;
import crudcar.entity.Manufacturer;
import crudcar.exception.UserNotFoundException;
import crudcar.repository.CarsRepository;
import crudcar.repository.DetailsRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsService {
    @Autowired
    private CarsRepository repository;


    public Cars saveCars(Cars cars){
        return repository.save(cars);
    }



    public Cars getCarsById(int id) throws UserNotFoundException {
        Cars cars =repository.findById(id).orElse(null);

        if (cars == null){
            throw new UserNotFoundException("car id not found");
        }
        return repository.findById(id).orElse(null);
    }
    public String deletById(int id) throws UserNotFoundException {
        Cars car = repository.findById(id).orElse(null);
        if (car==null){
            throw new UserNotFoundException("car id not found");
        }
        repository.deleteById(id);
        String respdele="car data deleted "+id;
        return respdele;
    }
    public Cars updateCars(Cars cars, int id){
        Cars exsistingCars=repository.findById(id).orElse(null);
        return repository.save(cars);
    }

}
