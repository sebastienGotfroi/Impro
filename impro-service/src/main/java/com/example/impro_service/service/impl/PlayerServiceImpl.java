package com.example.impro_service.service.impl;

import com.example.impro_service.dao.IPlayerDAO;
import com.example.impro_service.entity.Player;
import com.example.impro_service.service.IPlayerService;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public class PlayerServiceImpl implements IPlayerService{

    private static IPlayerService playerService;

    private IPlayerDAO playerDAO;

    private PlayerServiceImpl(){
        playerDAO = IPlayerDAO.getInstance();
    }

    public static IPlayerService getInstance(){
        if(playerService == null){
            playerService = new PlayerServiceImpl();
        }
        return playerService;
    }

    @Override
    public List<Player> getAll() {
        return playerDAO.getAll();
    }

    @Override
    public Player get(Integer id) throws IllegalArgumentException {
        if(id == null) {
            throw new IllegalArgumentException("Improvisation id is required");
        }
        return playerDAO.get(id);
    }

    @Override
    public Player update(Player player) throws IllegalArgumentException {
        this.fullValidate(player);
        return playerDAO.update(player);
    }

    @Override
    public Player create(Player player) throws IllegalArgumentException {
        this.validate(player);
        return playerDAO.create(player);
    }

    @Override
    public void delete(Player player) throws IllegalArgumentException {
        this.fullValidate(player);
        playerDAO.delete(player);
    }

    private void validate(Player player) throws IllegalArgumentException{
        if( player.getName().isEmpty() ){
            throw new IllegalArgumentException("Player name is required");
        }
        if( player.getNumber() == null ){
            throw new IllegalArgumentException("Player number is required");
        }
        if( player.getTeam() == null ){
            throw new IllegalArgumentException("Player team is required");
        }
    }

    private void fullValidate (Player player) throws IllegalArgumentException{
        this.validate(player);

        if(player.getId() == null){
            throw new IllegalArgumentException("Player id is required");
        }
    }
}
