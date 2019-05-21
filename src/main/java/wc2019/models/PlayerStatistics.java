package wc2019.models;

import wc2019.models.enums.Round;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class PlayerStatistics {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull(message = "Number of points is mandatory")
    private Integer points;

    @NotBlank(message="One point hots are mandatory")
    private String onePoint;

    @NotBlank(message="Two point hots are mandatory")
    private String twoPoints;

    @NotBlank(message="Three point hots are mandatory")
    private String threePoints;

    @NotNull(message = "Number of offensive rebounds is mandatory")
    private Integer offensiveRebounds;

    @NotNull(message = "Number of defensive rebounds is mandatory")
    private Integer defensiveRebounds;

    @NotNull(message = "Number of assists rebounds is mandatory")
    private Integer assists;

    @NotNull(message = "Number of turnovers rebounds is mandatory")
    private Integer turnover;

    @NotNull(message = "Number of steals rebounds is mandatory")
    private Integer steals;

    @NotNull(message = "Number of indexpoints is mandatory")
    private Integer indexRating;

    @ManyToOne
    @JoinColumn(name="player_id")
    @NotNull(message = "Player is mandatory")
    Player player;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Round is mandatory")
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
