package com.entity;

import java.time.LocalDateTime;

public class message {
private  int id;
private  int userformid;
private String userform;
private int usertoid;
private String userto;
private String title;
private String context;
private String time;
private  int goodid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserformid() {
        return userformid;
    }

    public void setUserformid(int userformid) {
        this.userformid = userformid;
    }

    public String getUserform() {
        return userform;
    }

    public void setUserform(String userform) {
        this.userform = userform;
    }

    public int getUsertoid() {
        return usertoid;
    }

    public void setUsertoid(int usertoid) {
        this.usertoid = usertoid;
    }

    public String getUserto() {
        return userto;
    }

    public void setUserto(String userto) {
        this.userto = userto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getGoodid() {
        return goodid;
    }

    public void setGoodid(int goodid) {
        this.goodid = goodid;
    }
}
