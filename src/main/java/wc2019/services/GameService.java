package wc2019.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wc2019.models.Game;
import wc2019.repositories.GameRepository;

@Service
public class GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game save(Game game) {
        return this.gameRepository.save(game);
    }
}
