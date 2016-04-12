package com.babel.dto;

import java.io.Serializable;

/**
 * Created by antonio.fernandez on 12/04/2016.
 */
public class TestDto implements Serializable{

    private String data;

    public TestDto(){
        super();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
