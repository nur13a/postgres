package com.company.model;

public class Student {
    private int ID;
    private String name;
    private int group_1;

    public Student(int ID, String name, int group_1) {
        this.ID = ID;
        this.name = name;
        this.group_1 = group_1;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup_1() {
        return group_1;
    }

    public void setGroup_1(int group_1) {
        this.group_1 = group_1;
    }
}
