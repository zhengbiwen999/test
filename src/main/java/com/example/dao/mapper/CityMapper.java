package com.example.dao.mapper;

import com.example.model.CityEntity;

import java.util.List;

public interface CityMapper extends MyMapper<CityEntity> {

    List<CityEntity> getAllCitys();
}
