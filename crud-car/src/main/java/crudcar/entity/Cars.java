package crudcar.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CAR_TBL")
public class Cars {

    @Id
    @GeneratedValue
    @Column(name = "cId")
    private int id;
    @NotEmpty(message = "please enter the condition of car")
    private String condition;


    @OneToOne(cascade = CascadeType.ALL)
    private Details details;

    @OneToOne(cascade = CascadeType.ALL)
    private  Location location;


}
