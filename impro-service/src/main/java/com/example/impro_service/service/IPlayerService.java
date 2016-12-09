package com.example.impro_service.service;

import com.example.impro_service.entity.Player;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface IPlayerService {
    List<Player> getAll();
    Player get(Integer id) throws IllegalArgumentException;
    Player update (Player player) throws IllegalArgumentException;
    Player create (Player player) throws IllegalArgumentException;
    void delete (Player player) throws IllegalArgumentException;
}
