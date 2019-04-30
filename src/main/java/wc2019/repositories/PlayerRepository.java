package wc2019.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wc2019.models.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
