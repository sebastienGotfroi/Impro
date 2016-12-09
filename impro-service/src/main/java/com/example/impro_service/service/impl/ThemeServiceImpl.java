package com.example.impro_service.service.impl;

import com.example.impro_service.dao.IThemeDAO;
import com.example.impro_service.entity.Theme;
import com.example.impro_service.service.IThemeService;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public class ThemeServiceImpl implements IThemeService {

    private static IThemeService themeService;

    private IThemeDAO themeDAO;

    private ThemeServiceImpl(){
        themeDAO = IThemeDAO.getInstance();
    }

    public static IThemeService getInstance(){
        if(themeService == null){
            themeService = new ThemeServiceImpl();
        }
        return themeService;
    }

    @Override
    public List<Theme> getAll() {
        return themeDAO.getAll();
    }

    @Override
    public Theme get(Integer id) throws IllegalArgumentException {
        if(id == null) {
            throw new IllegalArgumentException("Improvisation id is required");
        }
        return themeDAO.get(id);
    }

    @Override
    public Theme update(Theme theme) throws IllegalArgumentException {
        this.fullValidate(theme);
        return themeDAO.update(theme);
    }

    @Override
    public Theme create(Theme theme) throws IllegalArgumentException {
        this.validate(theme);
        return themeDAO.create(theme);
    }

    @Override
    public void delete(Theme theme) throws IllegalArgumentException {
        this.fullValidate(theme);
        themeDAO.delete(theme);
    }
    private void validate(Theme theme) throws IllegalArgumentException{
        if( theme.getName().isEmpty() ){
            throw new IllegalArgumentException("Theme name is required");
        }
    }

    private void fullValidate (Theme theme) throws IllegalArgumentException{
        this.validate(theme);

        if(theme.getId() == null){
            throw new IllegalArgumentException("Theme id is required");
        }
    }
}
