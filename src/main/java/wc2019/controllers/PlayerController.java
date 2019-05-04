package wc2019.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wc2019.models.Player;
import wc2019.services.PlayerService;

import javax.websocket.server.PathParam;
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

    @GetMapping(value = "/player/{id}")
    public Player findById(@PathVariable("id") Integer id) {
        return this.playerService.findById(id);
    }

    @DeleteMapping(value = "/player/{id}")
    public void delete(@PathVariable("id") Integer id) {
        this.playerService.delete(id);
    }
}
