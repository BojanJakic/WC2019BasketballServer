package wc2019.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wc2019.models.Game;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
