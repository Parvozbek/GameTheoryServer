package diploma.gametheory.repository;


import diploma.gametheory.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User,Long> {

    Optional<User> findOneByUserName(String email);

}
