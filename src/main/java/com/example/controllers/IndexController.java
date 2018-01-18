package com.example.controllers;

import com.example.config.WebConfig;
import com.example.model.CityEntity;
import com.example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController{

    @Autowired
    WebConfig webConfig;

    @Autowired
    CityService cityService;

    @RequestMapping("/")
    String index(ModelMap map) {
        map.addAttribute("title", webConfig.getWebTitle());
        map.addAttribute("name", webConfig.getAuthorName());
        map.addAttribute("blog", webConfig.getAuthorBlogUrl());
        return "index";
    }

    @RequestMapping(value = "/citys",method = RequestMethod.GET)
    List<CityEntity> getCitys() {
        List<CityEntity> allCitys = cityService.getAllCitys(1, 10);
        return allCitys;
    }
}
