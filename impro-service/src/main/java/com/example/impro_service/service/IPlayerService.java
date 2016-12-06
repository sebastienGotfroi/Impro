package com.example.impro_service.service;

import com.example.impro_service.entity.Player;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface IPlayerService {
    List<Player> getAll();
    Player get(Integer id);
    Player update (Player Player);
    Player create (Player Player);
    void delete (Player Player);
}
