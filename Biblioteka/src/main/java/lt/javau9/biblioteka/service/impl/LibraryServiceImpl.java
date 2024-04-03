package lt.javau9.biblioteka.service.impl;

import lt.javau9.biblioteka.models.Address;
import lt.javau9.biblioteka.models.Library;
import lt.javau9.biblioteka.repositories.AddressRepository;
import lt.javau9.biblioteka.repositories.BookRepository;
import lt.javau9.biblioteka.repositories.LibraryRepository;
import lt.javau9.biblioteka.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;
    private final AddressRepository addressRepository;
    private final BookRepository bookRepository;

    @Autowired
    public LibraryServiceImpl(LibraryRepository libraryRepository, AddressRepository addressRepository, BookRepository bookRepository) {
        this.libraryRepository = libraryRepository;
        this.addressRepository = addressRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public Library addLibrary(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public Library getLibraryById(Long id) {
        return libraryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Neteisingas ID"));
    }

    @Override
    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    @Override
    public void removeLibrary(Long id) {
        libraryRepository.deleteById(id);

    }

    @Override
    public Library getLibraryByName(String name) {
        return libraryRepository.findByName(name);
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();

    }

    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

}
