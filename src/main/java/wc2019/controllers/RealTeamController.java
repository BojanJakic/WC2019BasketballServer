package wc2019.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wc2019.models.RealTeam;
import wc2019.services.RealTeamService;

import java.util.List;

@RestController
@CrossOrigin()
public class RealTeamController {

    private RealTeamService realTeamService;

    @Autowired
    public RealTeamController(RealTeamService realTeamService) {
        this.realTeamService = realTeamService;
    }

    @PostMapping(value = "/real-team")
    public RealTeam save(@RequestBody RealTeam realTeam) {
        return this.realTeamService.save(realTeam);
    }

    @GetMapping(value = "/real-team")
    public List<RealTeam> getAll() {
        return realTeamService.getAll();
    }
}
