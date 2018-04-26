package com.av.config.entities;

import org.springframework.stereotype.Component;

@Component
public class BaseballGame implements Game{
    Team homeTeam;
    Team awayTeam;

    public BaseballGame() {}

    public BaseballGame(Team home, Team away) {
        this.homeTeam = home;
        this.awayTeam = away;
    }

    @Override
    public Team getHomeTeam() {
        return this.homeTeam;
    }

    @Override
    public Team getAwayTeam() {
        return this.awayTeam;
    }

    @Override
    public void playGame() {
        System.out.println(Math.random()<0.5?homeTeam.getName() : awayTeam.getName());
    }

    @Override
    public void setHomeTeam(Team home) {
        this.homeTeam = home;
    }

    @Override
    public void setAwayTeam(Team away) {
        this.awayTeam = away;
    }
}
