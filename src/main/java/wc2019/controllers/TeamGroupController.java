package wc2019.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wc2019.models.TeamGroup;
import wc2019.services.TeamGroupService;

import java.util.List;

@RestController
@CrossOrigin()
public class TeamGroupController {

    private TeamGroupService teamGroupService;

    @Autowired
    public TeamGroupController(TeamGroupService teamGroupService) {
        this.teamGroupService = teamGroupService;
    }

    @PostMapping("/team-group")
    public TeamGroup save(@RequestBody TeamGroup teamGroup) {
        return teamGroupService.save(teamGroup);
    }

    @GetMapping("/team-group")
    public List<TeamGroup> getAll() {
        return teamGroupService.getAll();
    }
}
