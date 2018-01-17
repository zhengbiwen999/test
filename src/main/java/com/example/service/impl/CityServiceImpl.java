package com.example.service.impl;

import com.example.dao.mapper.CityMapper;
import com.example.model.City;
import com.example.model.CityVO;
import com.example.service.CityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class CityServiceImpl implements CityService {

    Logger logger = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<CityVO> getAllCitys(int pageIndex, int pageSize) {

        PageHelper.startPage(pageIndex,pageSize);

        List<City> list = cityMapper.getAllCitys();

        List<CityVO> result = new ArrayList<>();

        PageInfo page = new PageInfo(list);

        if(!CollectionUtils.isEmpty(list)){
            BeanUtils.copyProperties(list,result);
        }
        logger.info("pageInfo => page"+page.getPageNum());
        return result;
    }


}
