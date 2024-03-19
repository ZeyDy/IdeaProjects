package javau9.libraryjpa.modules;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import javau9.libraryjpa.modules.Library;
@Entity
public class Address {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String location;

    @OneToOne(mappedBy = "address")
    @JsonBackReference
    private Library library;
    public Address() {}
    public Address(Library library) {
        this.library = library;
    }

    public Address(long id, String location, Library library) {
        this.id = id;
        this.location = location;
        this.library = library;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", location='" + location +
                '}';
    }
}
