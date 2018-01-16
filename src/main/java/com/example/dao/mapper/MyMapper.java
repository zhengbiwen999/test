package com.example.dao.mapper;

import com.example.model.City;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {

    List<City> getAllCitys();
}
