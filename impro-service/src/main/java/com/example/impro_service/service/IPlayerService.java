package com.example.impro_service.service;

import com.example.impro_service.entity.Player;

import java.util.List;

public interface IPlayerService {
    List<Player> getAll();
    Player get(Integer id) throws IllegalArgumentException;
    Player update (Player player) throws IllegalArgumentException;
    Player create (Player player) throws IllegalArgumentException;
    void delete (Player player) throws IllegalArgumentException;
}
