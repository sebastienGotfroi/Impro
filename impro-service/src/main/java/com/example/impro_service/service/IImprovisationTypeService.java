package com.example.impro_service.service;

import com.example.impro_service.entity.ImprovisationType;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface IImprovisationTypeService {
    List<ImprovisationType> getAll();
    ImprovisationType get(Integer id);
    ImprovisationType update (ImprovisationType ImprovisationType);
    ImprovisationType create (ImprovisationType ImprovisationType);
    void delete (ImprovisationType ImprovisationType);
}
