package com.example.gridviewdemo;

import android.content.Context;

import java.util.List;

public class Member {
    private int image;
    private int id;
    private String name;

    public Member() {
        super();
    }

    public Member(int image, int id, String name) {
        super();
        this.image = image;
        this.id = id;
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
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
