package crudcar.controller;


import crudcar.entity.Cars;
import crudcar.exception.UserNotFoundException;
import crudcar.service.CarsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarsController {

    @Autowired
    private CarsService service;

    @PostMapping("/cars")
    public Cars addCars (@Valid @RequestBody Cars cars){
        return service.saveCars(cars);
    }

    @GetMapping("/cars/{id}")
    public Cars findCarsById(@PathVariable int id ) throws UserNotFoundException {
        return  service.getCarsById(id);
    }

    @PutMapping("/cars/{id}")
    public Cars updateCars(@Valid @PathVariable int id,@RequestBody Cars cars){

        return service.updateCars(cars,id);
    }

    @DeleteMapping("/cars/{id}")
    public String deleteCarsById(@PathVariable int id ) throws UserNotFoundException {
        return service.deletById(id);

    }
}
