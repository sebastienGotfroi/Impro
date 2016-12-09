package com.example.impro_service.dao;

import com.example.impro_service.entity.Improvisation;
import com.example.impro_service.entity.ImprovisationType;

import java.util.List;

/**
 * Created by cecem on 05/12/2016.
 */

public interface IImprovisationTypeDAO {
    static IImprovisationTypeDAO getInstance(){return null;};
    List<ImprovisationType> getAll();
    ImprovisationType get(Integer id);
    ImprovisationType update (ImprovisationType improvisationType);
    ImprovisationType create (ImprovisationType improvisationType);
    void delete (ImprovisationType improvisationType);
}
