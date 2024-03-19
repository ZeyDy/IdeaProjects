package javau9.libraryjpa.controller;

import javau9.libraryjpa.modules.Address;
import javau9.libraryjpa.modules.Library;
import javau9.libraryjpa.repositary.AddressRepository;
import javau9.libraryjpa.repositary.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @GetMapping("/dummy")
    public Library getDummyData() {
        Library lib = new Library();
        Address addr = new Address();
        lib.setAddress(addr);
        addr.setLibrary(lib);
        lib.setName("Mazvydo");
        addr.setLocation("Kranto g.");
        return lib;
    }
    @GetMapping("/home/library")
    public Library getNewLibrary() {
        Library lib = new Library();
        Address addr = new Address();
        addr.setLocation("Kranto g.");
        lib.setName("Mazvydo");
        lib.setAddress(addr);
        return lib;
    }

    @GetMapping("/home/address")
    public Address getNewAddressWithLibrary() {
        Address addr = new Address();
        addr.setLocation("Kranto g.");
        return addr;
    }
    @Autowired
    private LibraryRepository libraryRepository;

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/libraries")
    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    @GetMapping("/addresses")
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @PostMapping("/newlibrary")
    public Library addNewLibrary(@RequestBody Library library) {
        return libraryRepository.save(library);
    }
}
