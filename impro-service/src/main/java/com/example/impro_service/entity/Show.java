package com.example.impro_service.entity;

import com.example.impro_service.enumeration.Enum;

import java.util.Date;
import java.util.List;

public class Show {
    private Integer id;
    private String name;
    private Date date;
    private List<Team> teamList;
    private List<Improvisation> improvisationList;
    private Enum.ShowStatusEnum status;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public List<Improvisation> getImprovisationList() {
        return improvisationList;
    }

    public void setImprovisationList(List<Improvisation> improvisationList) {
        this.improvisationList = improvisationList;
    }

    public Enum.ShowStatusEnum getStatus() {
        return status;
    }

    public void setStatus(Enum.ShowStatusEnum status) {
        this.status = status;
    }
}
