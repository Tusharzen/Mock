package com.example.mock;

public class Movies {
    String name ;
    int duration ;

    
    public Movies() {
    }

    public Movies(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}
