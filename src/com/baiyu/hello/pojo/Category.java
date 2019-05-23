package com.baiyu.hello.pojo;

import org.springframework.stereotype.Component;

@Component("c")
public class Category {
    private int id;
    private String name = "分类";

    public void setId(int id) {
        this.id  = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
