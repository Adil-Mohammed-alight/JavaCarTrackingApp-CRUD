package crudcar.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manufacturer {

    @Id
    @GeneratedValue
    private int mId;

    @Min(value = 1,message ="enter the code" )
    private int code;

    @NotEmpty(message = "enter name of the car manufacturer")
    private String name;
}
