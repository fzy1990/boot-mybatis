package com.example.bootmybatis.controller;

import com.example.bootmybatis.domain.Happiness;
import com.example.bootmybatis.service.HappinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class HappinessController {
    @Autowired
    private HappinessService happinessService;

    @RequestMapping("/query")
    public Happiness testQuery(){
        return happinessService.selectService("北京");
    }

    @RequestMapping("/insert")
    public Happiness testInsert(){
        happinessService.insertService();
        return happinessService.selectService("西安");
    }

    @RequestMapping("/likeName")
    public List<Happiness> findLikeName(){
        happinessService.insertService();
        return happinessService.likeName("西安");
    }

    @RequestMapping("/deleteCity")
    public String deleteCity(String name){
        return happinessService.deleteHappiness(name);
    }
}
