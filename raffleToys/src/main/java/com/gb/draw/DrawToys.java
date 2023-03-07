package com.gb.draw;

import com.gb.model.Toy;
import com.gb.utils.WriteToyToFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DrawToys {

    private List<Toy> winningToy;

    public DrawToys(){
        winningToy = new ArrayList<>();
    }

    public void makeDraw(List<Toy> toys){
        for (Toy toy : toys){
            if(toy.getWinFrequency() >= 95){
                winningToy.add(toy);
            }
        }
    }

    public void getToy(WriteToyToFile writeToyToFile) throws IOException {
        writeToyToFile.write(winningToy.get(0));
        winningToy.remove(0);
    }

}
