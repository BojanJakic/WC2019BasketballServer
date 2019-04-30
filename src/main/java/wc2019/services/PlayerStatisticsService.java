package wc2019.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wc2019.models.PlayerStatistics;
import wc2019.repositories.PlayerStatisticsRepository;

@Service
public class PlayerStatisticsService {

    private final PlayerStatisticsRepository playerStatisticsRepository;

    @Autowired
    public PlayerStatisticsService(PlayerStatisticsRepository playerStatisticsRepository) {
        this.playerStatisticsRepository = playerStatisticsRepository;
    }

    public PlayerStatistics save(PlayerStatistics playerStatistics) {
        return this.playerStatisticsRepository.save(playerStatistics);
    }
}
