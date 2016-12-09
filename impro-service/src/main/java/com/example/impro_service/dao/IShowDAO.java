package com.example.impro_service.dao;

import com.example.impro_service.entity.Improvisation;
import com.example.impro_service.entity.Show;

import java.util.List;

public interface IShowDAO {
    static IShowDAO getInstance(){return null;};
    List<Show> getAll();
    Show get(Integer id);
    Show update (Show show);
    Show create (Show show);
    void delete (Show show);
}
