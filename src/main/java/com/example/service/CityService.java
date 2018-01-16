package com.example.service;

import com.example.model.CityVO;

import java.util.List;

public interface CityService {

    List<CityVO> getAllCitys(int pageIndex,int pageSize);

}
