package com.example.boilerplate.webapp.data.mappers.sql;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by pwiltr200 on 2/25/15.
 */
public class BasicSqlProvider {

    public String getBasicPojos(String name){
        String sql = new SQL(){{
            SELECT("name");
            FROM("BASIC");
            WHERE("name = #{name}");
        }}.toString();
        return sql;
    }
}
