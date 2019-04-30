package wc2019.models;

import wc2019.models.enums.Round;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Game {

    @Id
    @GeneratedValue
    private Integer id;
    private String teamOne;
    private String teamTwo;
    private Integer teamOnePoints;
    private Integer teamTwoPoints;
    private Date gameDate;
    @Enumerated
    private Round round;

    public Integer getId() {
        return id;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public Integer getTeamOnePoints() {
        return teamOnePoints;
    }

    public void setTeamOnePoints(Integer teamOnePoints) {
        this.teamOnePoints = teamOnePoints;
    }

    public Integer getTeamTwoPoints() {
        return teamTwoPoints;
    }

    public void setTeamTwoPoints(Integer teamTwoPoints) {
        this.teamTwoPoints = teamTwoPoints;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public void GameDate(Date gameDate) {
        this.gameDate = gameDate;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public void setGameDate(Date gameDate) {
        this.gameDate = gameDate;
    }


}
