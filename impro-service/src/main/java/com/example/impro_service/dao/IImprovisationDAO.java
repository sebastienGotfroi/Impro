package com.example.impro_service.dao;

import com.example.impro_service.entity.Improvisation;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface IImprovisationDAO {
    static IImprovisationDAO getInstance(){return null;};
    List<Improvisation> getAll();
    Improvisation get(Integer id);
    Improvisation update (Improvisation improvisation);
    Improvisation create (Improvisation improvisation);
    void delete (Improvisation improvisation);
}
