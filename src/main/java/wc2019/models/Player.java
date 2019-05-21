package wc2019.models;

import wc2019.models.enums.PlayerPosition;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank(message="First is mandatory")
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    private String lastName;

    @NotNull(message = "Height is mandatory")
    private String height;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Position is mandatory")
    private PlayerPosition position;

    @NotNull(message = "Birthday is mandatory")
    private Date dateOfBirth;

    @NotNull(message = "Fantasy value is mandatory")
    private Double fantasyValue;

    @Transient
    private String profilePicture;

    @ManyToOne
    @JoinColumn(name="real_team_id")
    @NotNull(message = "Team is mandatory")
    private RealTeam realTeam;

    @ManyToMany
            @JoinTable(
                    name="player_fantasy_team",
                    joinColumns = @JoinColumn(name = "player_id"),
                    inverseJoinColumns = @JoinColumn(name = "fantasy_team_id")
            )
    List<FantasyTeam> fantasyTeam;


    public Integer getId() {
        return id;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getFantasyValue() {
        return fantasyValue;
    }

    public void setFantasyValue(Double fantasyValue) {
        this.fantasyValue = fantasyValue;
    }

    public RealTeam getRealTeam() {
        return realTeam;
    }

    public void setRealTeam(RealTeam realTeam) {
        this.realTeam = realTeam;
    }

    public List<FantasyTeam> getFantasyTeam() {
        return fantasyTeam;
    }

    public void setFantasyTeam(List<FantasyTeam> fantasyTeam) {
        this.fantasyTeam = fantasyTeam;
    }
}
