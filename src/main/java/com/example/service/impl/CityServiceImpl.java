package com.example.service.impl;

import com.example.dao.mapper.CityMapper;
import com.example.model.CityEntity;
import com.example.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    Logger logger = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<CityEntity> getAllCitys(int pageIndex, int pageSize) {

//        PageHelper.startPage(pageIndex,pageSize);

        //List<CityEntity> list = cityMapper.selectAll();

        List list = new ArrayList();
//        PageInfo page = new PageInfo(list);

//        logger.info("pageInfo => page"+page.getPageNum());

        return list;
    }


}
