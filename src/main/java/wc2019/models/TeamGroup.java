package wc2019.models;

import wc2019.models.enums.GroupName;
import wc2019.validation.annotation.TeamsGroupSize;
import wc2019.validation.annotation.UniqueGroupName;

import javax.persistence.*;
import java.util.List;

@Entity
public class TeamGroup {

    @Id
    @GeneratedValue
    private Integer id;

    @Enumerated(EnumType.STRING)
    @UniqueGroupName
    private GroupName groupName;

    @TeamsGroupSize
    @ManyToMany
    @JoinTable(
            name = "team_group_team",
            joinColumns = @JoinColumn(name = "team_group_id"),
            inverseJoinColumns = @JoinColumn(name="real_team_id")
    )
    List<RealTeam> teams;

    public Integer getId() {
        return id;
    }

    public GroupName getGroupName() {
        return groupName;
    }

    public void setGroupName(GroupName groupName) {
        this.groupName = groupName;
    }

    public List<RealTeam> getTeams() {
        return teams;
    }

    public void setTeams(List<RealTeam> teams) {
        this.teams = teams;
    }
}
