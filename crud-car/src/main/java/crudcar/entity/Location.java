package crudcar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Location {

    @Id
    @GeneratedValue
    private int lId;

    @Min(value = -90,message = "enter valid latitude")
    @Max(value = 90,message = "enter valid latitude")
    private double lat;

    @Min(value = -190,message = "enter valid longitude")
    @Max(value = 190,message = "enter valid longitude")
    private double lon;

}
