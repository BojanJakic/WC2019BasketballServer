package wc2019.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wc2019.models.PlayerStatistics;

public interface PlayerStatisticsRepository extends JpaRepository<PlayerStatistics, Integer> {
}
