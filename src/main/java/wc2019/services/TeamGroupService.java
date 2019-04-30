package wc2019.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wc2019.models.TeamGroup;
import wc2019.repositories.TeamGroupRepository;

@Service
public class TeamGroupService {

    private final TeamGroupRepository teamGroupRepository;

    @Autowired
    public TeamGroupService(TeamGroupRepository teamGroupRepository) {
        this.teamGroupRepository = teamGroupRepository;
    }

    public TeamGroup save(TeamGroup teamGroup) {
        return teamGroupRepository.save(teamGroup);
    }
}
