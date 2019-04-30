package wc2019.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wc2019.models.Player;
import wc2019.repositories.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player save(Player player) {
       return this.playerRepository.save(player);
    }

    public List<Player> getAll() {
        return this.playerRepository.findAll();
    }
}
