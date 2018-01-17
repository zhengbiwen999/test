package com.example.service;

import com.example.model.CityEntity;

import java.util.List;


public interface CityService {

    List<CityEntity> getAllCitys(int pageIndex, int pageSize);

}
