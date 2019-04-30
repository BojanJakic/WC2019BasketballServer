package wc2019.models;

import wc2019.models.enums.Round;

import javax.persistence.*;
import java.util.List;

@Entity
public class PlayerStatistics {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer points;
    private String onePoint;
    private String twoPoints;
    private String threePoints;
    private Integer offensiveRebounds;
    private Integer defensiveRebounds;
    private Integer assists;
    private Integer turnover;
    private Integer steals;
    private Integer indexRating;
    @ManyToOne
    @JoinColumn(name="player_id")
    Player player;
    @Enumerated(EnumType.STRING)
    private Round round;


    public Integer getId() {
        return id;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getOnePoint() {
        return onePoint;
    }

    public void setOnePoint(String onePoint) {
        this.onePoint = onePoint;
    }

    public String getTwoPoints() {
        return twoPoints;
    }

    public void setTwoPoints(String twoPoints) {
        this.twoPoints = twoPoints;
    }

    public String getThreePoints() {
        return threePoints;
    }

    public void setThreePoints(String threePoints) {
        this.threePoints = threePoints;
    }

    public Integer getOffensiveRebounds() {
        return offensiveRebounds;
    }

    public void setOffensiveRebounds(Integer offensiveRebounds) {
        this.offensiveRebounds = offensiveRebounds;
    }

    public Integer getDefensiveRebounds() {
        return defensiveRebounds;
    }

    public void setDefensiveRebounds(Integer defensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getTurnover() {
        return turnover;
    }

    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
    }

    public Integer getSteals() {
        return steals;
    }

    public void setSteals(Integer steals) {
        this.steals = steals;
    }

    public Integer getIndexRating() {
        return indexRating;
    }

    public void setIndexRating(Integer indexRating) {
        this.indexRating = indexRating;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
