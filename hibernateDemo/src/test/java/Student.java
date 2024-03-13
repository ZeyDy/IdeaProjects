import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
    @Id
    Integer id;
    String name;
    Integer age;

    public Student(java.lang.Integer id, java.lang.String name, java.lang.Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
