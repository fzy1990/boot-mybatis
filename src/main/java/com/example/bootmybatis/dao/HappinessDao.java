package com.example.bootmybatis.dao;

import com.example.bootmybatis.domain.Happiness;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HappinessDao {
    @Select("SELECT * FROM happiness WHERE city = #{city}")
    Happiness findHappinessByCity(@Param("city") String city);

    @Insert("INSERT INTO happiness(city, num) VALUES(#{city}, #{num})")
    int insertHappiness(@Param("city") String city, @Param("num") Integer num);

    @Select("select * from happiness where city=#{name}")
    List<Happiness> likeName(String name);

    @Delete("delete from happiness where city=#{name}")
    int deleteCity(String name);
}
