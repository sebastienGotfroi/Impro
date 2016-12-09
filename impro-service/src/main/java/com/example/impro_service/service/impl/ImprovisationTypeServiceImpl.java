package com.example.impro_service.service.impl;

import com.example.impro_service.dao.IImprovisationTypeDAO;
import com.example.impro_service.entity.ImprovisationType;
import com.example.impro_service.service.IImprovisationTypeService;

import java.util.List;

public class ImprovisationTypeServiceImpl implements IImprovisationTypeService {

    private static IImprovisationTypeService improvisationTypeService;

    private IImprovisationTypeDAO improvisationTypeDAO;

    private ImprovisationTypeServiceImpl(){
        improvisationTypeDAO = IImprovisationTypeDAO.getInstance();
    }

    public static IImprovisationTypeService getInstance(){
        if(improvisationTypeService == null){
            improvisationTypeService = new ImprovisationTypeServiceImpl();
        }
        return improvisationTypeService;
    }


    @Override
    public List<ImprovisationType> getAll() {
        return improvisationTypeDAO.getAll();
    }

    @Override
    public ImprovisationType get(Integer id) throws IllegalArgumentException {
        if(id == null) {
            throw new IllegalArgumentException("Improvisation id is required");
        }
        return improvisationTypeDAO.get(id);
    }

    @Override
    public ImprovisationType update(ImprovisationType improvisationType) throws IllegalArgumentException {
        this.fullValidate(improvisationType);
        return improvisationTypeDAO.update(improvisationType);
    }

    @Override
    public ImprovisationType create(ImprovisationType improvisationType) throws IllegalArgumentException {
        this.validate(improvisationType);
        return improvisationTypeDAO.create(improvisationType);
    }

    @Override
    public void delete(ImprovisationType improvisationType) throws IllegalArgumentException {
        this.fullValidate(improvisationType);
        improvisationTypeDAO.delete(improvisationType);
    }
    private void validate(ImprovisationType improvisationType) throws IllegalArgumentException{
        if( improvisationType.getName().isEmpty() ){
            throw new IllegalArgumentException("ImprovisationType name is required");
        }
    }

    private void fullValidate (ImprovisationType improvisationType) throws IllegalArgumentException{
        this.validate(improvisationType);

        if(improvisationType.getId() == null){
            throw new IllegalArgumentException("ImprovisationType id is required");
        }
    }
}
