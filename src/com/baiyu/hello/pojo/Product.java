package com.baiyu.hello.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("p")
public class Product {
    private int id;
    private String name = "product";
    //@Autowired
    @Resource(name = "c")
    private Category category;

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

    //@Autowired
    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}
