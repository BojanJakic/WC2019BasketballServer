package wc2019.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wc2019.models.RealTeam;
import wc2019.repositories.RealTeamRepository;

import java.util.List;

@Service
public class RealTeamService {

    private final RealTeamRepository realTeamRepository;

    @Autowired
    public RealTeamService(RealTeamRepository realTeamRepository) {
        this.realTeamRepository = realTeamRepository;
    }

    public RealTeam save(RealTeam team) {
        return realTeamRepository.save(team);
    }

    public List<RealTeam> getAll() {
        return realTeamRepository.findAll();
    }
}
