package com.example.bootmybatis.service;


import com.example.bootmybatis.dao.HappinessDao;
import com.example.bootmybatis.domain.Happiness;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HappinessService {

    @Resource
    private HappinessDao happinessDao;

    public Happiness selectService(String city){
        return happinessDao.findHappinessByCity(city);
    }

    @Transactional
    public void insertService(){
        happinessDao.insertHappiness("西安", 9421);
//        int a = 1 / 0; //模拟故障
        happinessDao.insertHappiness("长安", 1294);
    }

    public List<Happiness> likeName(String name){
        System.out.println(name);
        return happinessDao.likeName(name);
    }

    public String deleteHappiness(String cityName){
        try {
            happinessDao.deleteCity(cityName);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }
}
