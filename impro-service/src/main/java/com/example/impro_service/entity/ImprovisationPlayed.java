package com.example.impro_service.entity;

public class ImprovisationPlayed extends Improvisation {
    private Team winner;

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }
}
