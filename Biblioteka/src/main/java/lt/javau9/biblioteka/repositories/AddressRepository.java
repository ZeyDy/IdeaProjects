package lt.javau9.biblioteka.repositories;

import lt.javau9.biblioteka.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
