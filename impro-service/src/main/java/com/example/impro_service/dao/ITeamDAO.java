package com.example.impro_service.dao;

import com.example.impro_service.entity.Improvisation;
import com.example.impro_service.entity.Team;

import java.util.List;

public interface ITeamDAO {
    static ITeamDAO getInstance(){return null;};
    List<Team> getAll();
    Team get(Integer id);
    Team update (Team team);
    Team create (Team team);
    void delete (Team team);
}
