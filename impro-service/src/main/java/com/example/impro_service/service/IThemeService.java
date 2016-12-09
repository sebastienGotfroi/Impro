package com.example.impro_service.service;

import com.example.impro_service.entity.Theme;

import java.util.List;

public interface IThemeService {
    List<Theme> getAll();
    Theme get(Integer id)throws IllegalArgumentException;
    Theme update (Theme theme)throws IllegalArgumentException;
    Theme create (Theme theme)throws IllegalArgumentException;
    void delete (Theme theme)throws IllegalArgumentException;
}
