package wc2019.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import wc2019.models.TeamGroup;
import wc2019.models.enums.GroupName;

public interface TeamGroupRepository extends JpaRepository<TeamGroup, Integer> {

    @Query("SELECT group FROM TeamGroup group WHERE group.groupName = ?1")
    TeamGroup findByName(GroupName name);
}
