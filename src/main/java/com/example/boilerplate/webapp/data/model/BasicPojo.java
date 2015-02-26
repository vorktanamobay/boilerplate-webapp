package com.example.boilerplate.webapp.data.model;

/**
 * Created by pwiltr200 on 2/25/15.
 */
public class BasicPojo {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BasicPojo{" +
                "name='" + name + '\'' +
                '}';
    }
}
