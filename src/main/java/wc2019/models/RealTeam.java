package wc2019.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class RealTeam {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int wonGames;
    private int lostGame;
    private int scoredPoints;
    private int opponentsPoints;
    @ManyToMany(mappedBy = "teams")
    @JsonIgnore
    List<TeamGroup> groupNames;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWonGames() { return wonGames; }

    public void setWonGames(int wonGames) {
        this.wonGames = wonGames;
    }

    public Integer getLostGame() {
        return lostGame;
    }

    public void setLostGame(int lostGame) {
        this.lostGame = lostGame;
    }

    public int getScoredPoints() {
        return scoredPoints;
    }

    public void setScoredPoints(int scoredPoints) {
        this.scoredPoints = scoredPoints;
    }

    public int getOpponentsPoints() {
        return opponentsPoints;
    }

    public void setOpponentsPoints(int opponentsPoints) {
        this.opponentsPoints = opponentsPoints;
    }

    public List<TeamGroup> getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(List<TeamGroup> groupNames) {
        this.groupNames = groupNames;
    }
}
