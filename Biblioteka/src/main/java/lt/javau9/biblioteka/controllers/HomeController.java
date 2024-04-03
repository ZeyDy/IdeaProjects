package lt.javau9.biblioteka.controllers;


import lt.javau9.biblioteka.models.Address;
import lt.javau9.biblioteka.models.Book;
import lt.javau9.biblioteka.models.Library;
import lt.javau9.biblioteka.repositories.BookRepository;
import lt.javau9.biblioteka.service.impl.LibraryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    LibraryServiceImpl libService;
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookRepository.save(book);
        return ResponseEntity.ok().body(savedBook);
    }

    @GetMapping("/library/{libraryId}")
    public ResponseEntity<List<Book>> getBooksByLibraryId(@PathVariable Long libraryId) {
        List<Book> books = bookRepository.findByLibraryId(libraryId);
        return ResponseEntity.ok().body(books);
    }


    @GetMapping("/library/all")
    public List<Library> getAllLibraries() {
        return libService.getAllLibraries();

    }

    @GetMapping("/addresses")
    public List<Address> getAllAddresses() {
        return libService.getAllAddresses();
    }

    @PostMapping("/library/add")
    public ResponseEntity<Library> createLibrary(@RequestBody Library library) {
        // Save the address to the database first
        Address savedAddress = libService.addAddress(library.getAddress());

        // Set the saved address to the library
        library.setAddress(savedAddress);

        // Save the library to the database
        Library savedLibrary = libService.addLibrary(library);

        return ResponseEntity.ok(savedLibrary);
    }

    @DeleteMapping("/library/delete/{id}")
    public ResponseEntity<Void> deleteLibrary(@PathVariable Long id) {
        libService.removeLibrary(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/libraries")
    public ResponseEntity<Library> getLibraryByName(@RequestParam String name) {
        Library library = libService.getLibraryByName(name);
        if (library != null) {
            return ResponseEntity.ok(library);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/dummy")
    public Library getDummyData() {
        Library lib = new Library();
        Address addr = new Address();

        // Set the properties of the address
        addr.setLocation("K. Petrauusko g.");

        // Save the address to the database
        Address savedAddress = libService.addAddress(addr);

        // Set the properties of the library
        lib.setName("Mazvydo");
        lib.setAddress(savedAddress);

        // Save the library to the database
        libService.addLibrary(lib);

        return lib;
    }

    /*@GetMapping("/library")
    public Library getNewLibrary() {
        Library lib = new Library();
        Address addr = new Address();
        addr.setLocation("Kranto g.");
        lib.setName("Mazvydo");
        lib.setAddress(addr);
        return lib;
    }

    @GetMapping("/address")
    public Address getNewAddress() {
        Address addr = new Address();
        addr.setLocation("Kranto g.");
        return addr;
    }
*/
    @GetMapping("/book")
    public Book addNewBook() {
        Book book = new Book();
        book.setTitle("Biblija");
        Library lib = new Library();
        lib.setName("Mazvydo");
        book.setLibrary(lib);
        return book;
    }
}


