package wc2019.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wc2019.models.TeamGroup;

public interface TeamGroupRepository extends JpaRepository<TeamGroup, Integer> {
}
