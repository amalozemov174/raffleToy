package com.gb.model;

public class Toy {

    private static Integer idCount = 1;
    private Integer id;
    private String description;
    private String name;
    private Integer winFrequency;

    public Toy(String description, String name, Integer winFrequency) {
        id = generateId();
        this.description = description;
        this.name = name;
        this.winFrequency = winFrequency;
    }


    public static Integer generateId() {
        return idCount++;
    }

    public void setWinFrequency(Integer winFrequency) {
        this.winFrequency = winFrequency;
    }


    public String getName() {
        return name;
    }

    public Integer getWinFrequency() {
        return winFrequency;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
