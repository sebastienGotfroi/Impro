package com.example.impro_service.service;

import com.example.impro_service.entity.Theme;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface IThemeService {
    List<Theme> getAll();
    Theme get(Integer id);
    Theme update (Theme Theme);
    Theme create (Theme Theme);
    void delete (Theme Theme);
}
