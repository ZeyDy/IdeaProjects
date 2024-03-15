package javau9.ca.hello.bootDemo.models;

public class StudentDTO {
    String name;
    String last;

    Long id;

    public StudentDTO(String name, String last, Long id) {
        this.name = name;
        this.last = last;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLast() {
        return last;
    }

    public Long getId() {
        return id;
    }
}
