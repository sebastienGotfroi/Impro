package com.example.impro_service.service.impl;

import com.example.impro_service.dao.IImprovisationDAO;
import com.example.impro_service.dao.ITeamDAO;
import com.example.impro_service.entity.Player;
import com.example.impro_service.entity.Team;
import com.example.impro_service.service.IImprovisationService;
import com.example.impro_service.service.ITeamService;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public class TeamServiceImpl implements ITeamService {

    private static ITeamService teamService;

    private ITeamDAO teamDAO;

    private TeamServiceImpl(){
        teamDAO = ITeamDAO.getInstance();
    }

    public static ITeamService getInstance(){
        if(teamService == null){
            teamService = new TeamServiceImpl();
        }
        return teamService;
    }

    @Override
    public List<Team> getAll() {
        return teamDAO.getAll();
    }

    @Override
    public Team get(Integer id) throws IllegalArgumentException {
        if(id == null) {
            throw new IllegalArgumentException("Improvisation id is required");
        }
        return teamDAO.get(id);
    }

    @Override
    public Team update(Team team) throws IllegalArgumentException {
        this.fullValidate(team);
        return teamDAO.update(team);
    }

    @Override
    public Team create(Team team) throws IllegalArgumentException {
        this.validate(team);
        return teamDAO.create(team);
    }

    @Override
    public void delete(Team team) throws IllegalArgumentException {
        this.fullValidate(team);
        teamDAO.delete(team);
    }
    private void validate(Team team) throws IllegalArgumentException{
        if( team.getName().isEmpty() ){
            throw new IllegalArgumentException("Team name is required");
        }
    }

    private void fullValidate (Team team) throws IllegalArgumentException{
        this.validate(team);

        if(team.getId() == null){
            throw new IllegalArgumentException("Team id is required");
        }
    }
}
