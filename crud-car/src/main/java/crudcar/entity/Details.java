package crudcar.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "details")
public class Details {
    @Id
    @GeneratedValue
    private int dId;

    @NotEmpty(message = "enter body type of the car")
    private String body;

    @OneToOne(cascade = CascadeType.ALL)
    private Manufacturer manufacturer;

    @NotEmpty(message = "enter the car model name")
    private String model;

    @Min(value = 2,message = "minimum doors shoud be 2")
    @Max(value = 5,message = "maximum doors should be 5")
    private int numberOfDoors;

    @NotEmpty(message = "enter fuel type")
    private String fuelType;

    @NotEmpty(message = "enter engine Details")
    private String engine;

    @Min(value = 2,message = "enter proper mileage")
    @Max(value = 30,message = "enter proper mileage")
    private int mileage;

    @Min(value = 1900,message = "enter car model-year after 1900")
    @Max(value = 2023,message = "enter carmodel-year before ")
    private int modelYear;

    @Min(value = 1900,message = "enter car model-year after 1900")
    @Max(value = 2023,message = "enter car model-year before 2023")
    private int productionYear;

    @NotEmpty(message = "enter the color of the car")
    private String externalColor;




}
