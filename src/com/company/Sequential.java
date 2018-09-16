package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Sequential {

    private static long startTime = 0;

    private static void tick(){
        startTime = System.currentTimeMillis();
    }
    private static float tock(){
        return (System.currentTimeMillis() - startTime) / 1000.0f;
    }

    public static void main(String[] args) {
        //if (args.length > 0) {
        tick();
            readData readData = new readData("sample_input.txt");

            Double mean = readData.countMean();

            ArrayList<Double> totals = readData.getTotalForAllTree();


            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("ffds.txt"));
                writer.write(String.valueOf(mean));
                writer.newLine();
                writer.write(String.valueOf(readData.getNumberOfTree()));
                writer.newLine();
                for (double i : totals) {
                    writer.write(String.valueOf(i));
                    writer.newLine();
                }
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        float time = tock();
            System.out.print(time);
       // }
    }
}
