package com.example.impro_service.service;

import com.example.impro_service.entity.Show;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface IShowService {
    List<Show> getAll();
    Show get(Integer id) throws IllegalArgumentException;
    Show update (Show show) throws IllegalArgumentException;
    Show create (Show show) throws IllegalArgumentException;
    void delete (Show show) throws IllegalArgumentException;
}
