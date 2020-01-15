package com.company.HW44;

public class City {
    private int ID;
    private String name;
    private int peopleCount;

    public City() {
    }

    public City(String name, int peopleCount) {
        this.name = name;
        this.peopleCount = peopleCount;
    }

    public City(int ID, String name, int peopleCount) {
        this.ID = ID;
        this.name = name;
        this.peopleCount = peopleCount;
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

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }
}
