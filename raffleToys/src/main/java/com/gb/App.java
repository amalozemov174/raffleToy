package com.gb;

import com.gb.services.ToyDrawService;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        String getToyPath = "src/main/resources/getToy.txt";
        ToyDrawService toyDrawService = new ToyDrawService(getToyPath);
        toyDrawService.makeToyDraw();
    }

}
