package com.example.dao.mapper;

import com.example.model.CityEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper extends MyMapper<CityEntity> {

    List<CityEntity> getAllCitys();
}
