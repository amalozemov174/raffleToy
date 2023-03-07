package com.gb.utils;

import com.gb.model.Toy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToyToFile {

    private BufferedWriter writer;

    public WriteToyToFile(String path) throws IOException {
        writer = new BufferedWriter(new FileWriter(path, true));
    }

    public void write(Toy toy) throws IOException {
        String write = toy.getId() + ";" + toy.getDescription() + ";" + toy.getName() + ";" + "\n";
        writer.append(write);
        writer.flush();
    }

}
