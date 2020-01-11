package com.company.model;

public class Country {
    private String name;
    private int presidentId;
public Country(){}
    public Country(String name, int presidentId) {
        this.name = name;
        this.presidentId = presidentId;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPresidentId(int president) {
        return presidentId;
    }

    public void setPresidentId(int presidentId) {
        this.presidentId = presidentId;
    }
}
