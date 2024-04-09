package safe.saugumas.repsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import safe.saugumas.entities.AppUser;

public interface UserRepository extends JpaRepository<Long, AppUser> {

    AppUser findByUsername(String username);

}
