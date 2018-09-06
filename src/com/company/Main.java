package com.company;

public class Main {

    public static void main(String[] args) {
        readData readData = new readData("sample_input.txt");

        readData.CalculateAvrg();
        readData.countMean();

    }
}
