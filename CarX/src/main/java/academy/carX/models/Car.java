package academy.carX.models;

import jakarta.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "user_id") // Turi sutapti su DB stulpelio pavadinimu.
    private UserEntity user; // Turi sutapti su 'mappedBy' reikšme `UserEntity`.

    public Car() {}

    public Car(Long id, String plateNumber, String make, String model) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.make = make;
        this.model = model;
    }

}
