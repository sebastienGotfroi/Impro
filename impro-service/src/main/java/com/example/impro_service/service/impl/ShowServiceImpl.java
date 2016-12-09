package com.example.impro_service.service.impl;

import com.example.impro_service.dao.IShowDAO;
import com.example.impro_service.entity.Show;
import com.example.impro_service.service.IShowService;

import java.util.List;

public class ShowServiceImpl implements IShowService {

    private static IShowService showService;

    private IShowDAO showDAO;

    private ShowServiceImpl(){
        showDAO = IShowDAO.getInstance();
    }

    public static IShowService getInstance(){
        if(showService == null){
            showService = new ShowServiceImpl();
        }
        return showService;
    }

    @Override
    public List<Show> getAll() {
        return showDAO.getAll();
    }

    @Override
    public Show get(Integer id) throws IllegalArgumentException {
        if(id == null) {
            throw new IllegalArgumentException("Show id is required");
        }
        return showDAO.get(id);
    }

    @Override
    public Show update(Show show)throws IllegalArgumentException {
        this.fullValidate(show);
        return showDAO.update(show);
    }

    @Override
    public Show create(Show show) throws IllegalArgumentException {
        this.validate(show);
        return showDAO.create(show);
    }

    @Override
    public void delete(Show show) throws IllegalArgumentException {
        this.fullValidate(show);
        showDAO.delete(show);
    }

    private void validate(Show show) throws IllegalArgumentException{
        if( show.getName().isEmpty() ){
            throw new IllegalArgumentException("Show name is required");
        }
        if( show.getDate() == null ){
            throw new IllegalArgumentException("Show date is required");
        }
        if( show.getTeamList() == null || show.getTeamList().size() < 2 ){
            throw new IllegalArgumentException("Show's teams is required");
        }
    }

    private void fullValidate (Show show) throws IllegalArgumentException{
        this.validate(show);

        if(show.getId() == null){
            throw new IllegalArgumentException("Show id is required");
        }
    }
}
