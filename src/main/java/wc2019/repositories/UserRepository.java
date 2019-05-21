package wc2019.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import wc2019.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT user FROM User user WHERE user.username = ?1")
    User findByUsername(String username);

    @Query("SELECT user FROM User user WHERE user.email = ?1")
    User findByEmail(String email);
}
