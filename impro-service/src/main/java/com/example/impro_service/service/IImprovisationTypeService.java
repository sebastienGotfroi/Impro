package com.example.impro_service.service;

import com.example.impro_service.entity.ImprovisationType;

import java.util.List;

public interface IImprovisationTypeService {
    List<ImprovisationType> getAll();
    ImprovisationType get(Integer id)throws IllegalArgumentException;
    ImprovisationType update (ImprovisationType improvisationType)throws IllegalArgumentException;
    ImprovisationType create (ImprovisationType improvisationType)throws IllegalArgumentException;
    void delete (ImprovisationType improvisationType)throws IllegalArgumentException;
}
