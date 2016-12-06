package com.example.impro_service.service;

import com.example.impro_service.entity.Show;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface IShowService {
    List<Show> getAll();
    Show get(Integer id);
    Show update (Show Show);
    Show create (Show Show);
    void delete (Show Show);
}
