package wc2019.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wc2019.models.FantasyTeam;
import wc2019.repositories.FantasyTeamRepository;

@Service
public class FantasyTeamService {

    private final FantasyTeamRepository fantasyTeamRepository;

    @Autowired
    public FantasyTeamService(FantasyTeamRepository fantasyTeamRepository) {
        this.fantasyTeamRepository = fantasyTeamRepository;
    }

    public FantasyTeam save(FantasyTeam team) {
        return this.fantasyTeamRepository.save(team);
    }
}
