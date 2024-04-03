package lt.javau9.biblioteka.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    @JsonManagedReference
    //@RestResource(path = "libraryAddress", rel="address")
    private Address address;

    @OneToMany(mappedBy = "library")
    private List<Book> books;

    // standard constructor, getters, setters


    public Library(long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Library() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override

    public String toString() {
        return "Library{" + "id=" + id + ", name=" + name + '}';
    }
}