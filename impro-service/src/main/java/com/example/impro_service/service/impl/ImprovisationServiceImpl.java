package com.example.impro_service.service.impl;

import com.example.impro_service.dao.IImprovisationDAO;
import com.example.impro_service.entity.Improvisation;
import com.example.impro_service.service.IImprovisationService;

import java.util.List;

public class ImprovisationServiceImpl implements IImprovisationService {

    private static IImprovisationService improvisationService;

    private IImprovisationDAO iImprovisationDAO;

    public ImprovisationServiceImpl(){
       iImprovisationDAO = IImprovisationDAO.getInstance();
    }

    public static IImprovisationService getInstance(){
        if(improvisationService == null){
            improvisationService = new ImprovisationServiceImpl();
        }
        return improvisationService;
    }

    @Override
    public List<Improvisation> getAll() {
        return iImprovisationDAO.getAll();
    }

    @Override
    public Improvisation get(Integer id) throws IllegalArgumentException{
        if(id == null) {
            throw new IllegalArgumentException("Improvisation id is required");
        }
        return iImprovisationDAO.get(id);
    }

    @Override
    public Improvisation update(Improvisation improvisation) throws IllegalArgumentException {
        this.validate(improvisation);
        return iImprovisationDAO.update(improvisation);
    }

    @Override
    public Improvisation create(Improvisation improvisation) {
        this.fullValidate(improvisation);
        return iImprovisationDAO.create(improvisation);
    }

    @Override
    public void delete(Improvisation improvisation) throws IllegalArgumentException {
        this.fullValidate(improvisation);
        iImprovisationDAO.delete(improvisation);
    }

    private void validate(Improvisation improvisation) throws IllegalArgumentException{
        if( improvisation.getName().isEmpty() ){
            throw new IllegalArgumentException("Improvisation name is required");
        }
        if( improvisation.getImprovisationType() == null ){
            throw new IllegalArgumentException("Improvisation type is required");
        }
        if( improvisation.getDurationInSec() == null ){
            throw new IllegalArgumentException("Improvisation duration is required");
        }
        if( improvisation.getDescription().isEmpty() ){
            throw new IllegalArgumentException("Improvisation description is required");
        }
    }

    private void fullValidate (Improvisation improvisation) throws IllegalArgumentException{
        this.validate(improvisation);

        if(improvisation.getId() == null){
            throw new IllegalArgumentException("Improvisation id is required");
        }
    }
}
