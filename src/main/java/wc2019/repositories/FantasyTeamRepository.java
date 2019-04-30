package wc2019.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wc2019.models.FantasyTeam;

public interface FantasyTeamRepository extends JpaRepository<FantasyTeam, Integer> {
}
