package wc2019.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wc2019.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
