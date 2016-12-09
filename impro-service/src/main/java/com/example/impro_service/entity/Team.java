package com.example.impro_service.entity;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public class Team {
    private Integer id;
    private String name;
    private List<Player> playerList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}
