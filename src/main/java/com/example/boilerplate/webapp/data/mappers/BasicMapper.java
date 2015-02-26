package com.example.boilerplate.webapp.data.mappers;

import com.example.boilerplate.webapp.data.mappers.sql.BasicSqlProvider;
import com.example.boilerplate.webapp.data.model.BasicPojo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by pwiltr200 on 2/25/15.
 */
public interface BasicMapper {

    @Select("select name from BASIC where name=#{name}")
    BasicPojo getBasicePojo(@Param("name") String name);

    @SelectProvider(type = BasicSqlProvider.class, method = "getBasicPojos")
    List<BasicPojo> getBasicPojos(String name);
}
