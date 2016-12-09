package com.example.impro_service.dao;

import com.example.impro_service.entity.Improvisation;
import com.example.impro_service.entity.Player;

import java.util.List;

public interface IPlayerDAO {
    static IPlayerDAO getInstance(){return null;};
    List<Player> getAll();
    Player get(Integer id);
    Player update (Player player);
    Player create (Player player);
    void delete (Player player);
}
