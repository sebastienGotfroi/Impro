package com.example.impro_service.service;

import com.example.impro_service.entity.Team;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface ITeamService {
    List<Team> getAll();
    Team get(Integer id)throws IllegalArgumentException;
    Team update (Team team)throws IllegalArgumentException;
    Team create (Team team)throws IllegalArgumentException;
    void delete (Team team)throws IllegalArgumentException;
}
