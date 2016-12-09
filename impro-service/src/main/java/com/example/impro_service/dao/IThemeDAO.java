package com.example.impro_service.dao;

import com.example.impro_service.entity.Improvisation;
import com.example.impro_service.entity.Theme;

import java.util.List;

public interface IThemeDAO {
    static IThemeDAO getInstance(){return null;};
    List<Theme> getAll();
    Theme get(Integer id);
    Theme update (Theme theme);
    Theme create (Theme theme);
    void delete (Theme theme);
}
