package com.av.config.entities;

public interface Game {
    Team getHomeTeam();
    Team getAwayTeam();
    void playGame();
    void setHomeTeam(Team home);
    void setAwayTeam(Team away);
}
