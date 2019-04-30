package wc2019.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import wc2019.models.TeamGroup;
import wc2019.services.TeamGroupService;

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
}
