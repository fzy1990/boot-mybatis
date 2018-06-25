package com.example.bootmybatis.domain;

public class Happiness {
    private Long id;
    private String city;
    private Integer num;

    public Happiness() {
    }

    public Happiness(Long id, String city, Integer num) {
        this.id = id;
        this.city = city;
        this.num = num;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
