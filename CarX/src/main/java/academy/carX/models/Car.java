package academy.carX.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String plateNumber;
    private String make;
    private String model;

    public Car() {}

    public Car(Long id, String plateNumber, String make, String model) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.make = make;
        this.model = model;
    }

}
