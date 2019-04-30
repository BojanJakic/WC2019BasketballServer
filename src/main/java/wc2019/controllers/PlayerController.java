package wc2019.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wc2019.models.Player;
import wc2019.services.PlayerService;

import java.util.List;

@RestController
@CrossOrigin()
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping(value = "/player")
    public Player save(@RequestBody Player player) {
        return this.playerService.save(player);
    }

    @GetMapping(value = "/player")
    public List<Player> getAll() {
        return this.playerService.getAll();
    }
}
