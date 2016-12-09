package com.example.impro_service.service;

import com.example.impro_service.dao.IImprovisationDAO;
import com.example.impro_service.entity.Improvisation;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface IImprovisationService {
    static IImprovisationDAO getInstance(){return null;};
    List<Improvisation> getAll();
    Improvisation get(Integer id) throws IllegalArgumentException;
    Improvisation update (Improvisation improvisation) throws IllegalArgumentException;
    Improvisation create (Improvisation improvisation) throws IllegalArgumentException;
    void delete (Improvisation improvisation) throws IllegalArgumentException;
}
