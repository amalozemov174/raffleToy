package com.gb.services;

import com.gb.draw.DrawToys;
import com.gb.entity.ToyStore;
import com.gb.model.Toy;
import com.gb.utils.WriteToyToFile;

import java.io.IOException;

public class ToyDrawService {

    private ToyStore toyStore;
    private DrawToys drawToys;
    private WriteToyToFile writeToyToFile;

    public ToyDrawService(String pathForToy) throws IOException {
        toyStore = new ToyStore();
        drawToys = new DrawToys();
        writeToyToFile = new WriteToyToFile(pathForToy);

        toyStore.addToy(new Toy("car toy", "Car", 80));
        toyStore.addToy(new Toy("ship toy", "Ship", 75));
        toyStore.addToy(new Toy("cat toy", "Cat", 95));
    }

    public void makeToyDraw() throws IOException {
        drawToys.makeDraw(toyStore.getToys());
        drawToys.getToy(writeToyToFile);
    }

}
