package com.example.controllers;

import com.example.config.WebConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    WebConfig webConfig;

    @RequestMapping("/")
    String index(ModelMap map) {
        map.addAttribute("title", webConfig.getWebTitle());
        map.addAttribute("name", webConfig.getAuthorName());
        map.addAttribute("blog", webConfig.getAuthorBlogUrl());
        return "index";
    }
}
