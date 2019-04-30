package wc2019.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class FantasyTeam {


    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToMany(mappedBy = "fantasyTeam")
    private List<Player> players;
    private Integer fantasyPoints;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayer() {
        return players;
    }

    public void setPlayer(List<Player> players) {
        this.players = players;
    }

    public Integer getPoints() {
        return fantasyPoints;
    }

    public void setPoints(Integer fantasyPoints) {
        this.fantasyPoints = fantasyPoints;
    }
}
