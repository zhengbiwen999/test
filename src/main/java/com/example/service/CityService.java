package com.example.service;

import com.example.model.CityVO;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;


public interface CityService {

    List<CityVO> getAllCitys(int pageIndex,int pageSize);

}
