package safe.saugumas.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String userName;
    String password;
    String role;


}
