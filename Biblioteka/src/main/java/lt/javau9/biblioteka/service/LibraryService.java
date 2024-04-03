package lt.javau9.biblioteka.service;

import lt.javau9.biblioteka.models.Address;
import lt.javau9.biblioteka.models.Library;

import java.util.List;

public interface LibraryService {
    Library addLibrary(Library library);

    Library getLibraryById(Long id);

    List<Library> getAllLibraries();

    List<Address> getAllAddresses();

    void removeLibrary(Long id);

    Library getLibraryByName(String name);

    Address addAddress(Address address);

}
