package com.example.impro_service.service;

import com.example.impro_service.entity.Team;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface ITeamService {
    List<Team> getAll();
    Team get(Integer id);
    Team update (Team Team);
    Team create (Team Team);
    void delete (Team Team);
}
