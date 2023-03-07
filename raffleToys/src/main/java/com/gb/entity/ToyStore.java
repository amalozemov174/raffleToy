package com.gb.entity;

import com.gb.model.Toy;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {

    private List<Toy> toys;

    public ToyStore() {
        this.toys = new ArrayList<Toy>();
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public void changeWinFrequency(String name, Integer winFrequency) {
        for (Toy toy : toys){
            if(toy.getName().equals(name)){
                toy.setWinFrequency(winFrequency);
            }
        }
    }

    public List<Toy> getToys() {
        return toys;
    }
}
