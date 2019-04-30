package wc2019;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import wc2019.models.Player;
import wc2019.models.RealTeam;
import wc2019.models.enums.PlayerPosition;
import wc2019.services.PlayerService;
import wc2019.services.RealTeamService;

import java.sql.Date;


@SpringBootApplication
public class MainClass {

    public static void main(String[] args){
        SpringApplication.run(MainClass.class);

    }
}
