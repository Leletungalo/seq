package com.company;

public class Main {

    static long startTime = 0;

    private static void tick(){
        startTime = System.currentTimeMillis();
    }
    private static float tock(){
        return (System.currentTimeMillis() - startTime) / 1000.0f;
    }

    public static void main(String[] args) {
        tick();
            readData readData = new readData("sample_input.txt"/*args[0]*/);
            float nun = tock();
            System.out.println("Time is : " + nun);
            tick();
            readData.CalculateAvrg();
            readData.countMean();
            float vvv = tock();
        System.out.println("Time is 0: " + vvv);
        System.out.println();

        tick();
        readData.CalculateAvrg();
        readData.countMean();
        float vvv1 = tock();
        System.out.println("Time is 1: " + vvv1);
        System.out.println();

        tick();
        readData.CalculateAvrg();
        readData.countMean();
        float vvv2 = tock();
        System.out.println("Time is 2: " + vvv2);
        System.out.println();

        tick();
        readData.CalculateAvrg();
        readData.countMean();
        float vvv3 = tock();
        System.out.println("Time is 3: " + vvv3);
        System.out.println();


        tick();
        readData.CalculateAvrg();
        readData.countMean();
        float vvv4 = tock();
        System.out.println("Time is 4 : " + vvv4);
        System.out.println();


        tick();
        readData.CalculateAvrg();
        readData.countMean();
        float vvv5 = tock();
        System.out.println("Time is 5 : " + vvv5);

    }
}
