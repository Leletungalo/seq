package com.company;

public class Main {

    private static long startTime = 0;

    private static void tick(){
        startTime = System.currentTimeMillis();
    }
    private static float tock(){
        return (System.currentTimeMillis() - startTime) / 1000.0f;
    }

    public static void main(String[] args) {
        System.out.println("kftjhjrduylituoyi");
        tick();
            readData readData = new readData("sample_input.txt"/*args[0]*/);
            float nun = tock();
            System.out.println("Time is : " + nun);
            System.out.println();

       tick();
        //readData.CalculateAvrg();
        //readData.countMean();
        new readData("sample_input.txt");
        float vvv1 = tock();
        System.out.println("Time is 1: " + vvv1);
        System.out.println();

        tick();
        //readData.CalculateAvrg();
        //readData.countMean();
        new readData("sample_input.txt");
        float vvv2 = tock();
        System.out.println("Time is 2: " + vvv2);
        System.out.println();

        tick();
        //readData.CalculateAvrg();
        //readData.countMean();
        new readData("sample_input.txt");
        float vvv3 = tock();
        System.out.println("Time is 3: " + vvv3);
        System.out.println();


        tick();
        //readData.CalculateAvrg();
        //readData.countMean();
        new readData("sample_input.txt");
        float vvv4 = tock();
        System.out.println("Time is 4 : " + vvv4);
        System.out.println();


        tick();
        //readData.CalculateAvrg();
        //readData.countMean();
        new readData("sample_input.txt");
        float vvv5 = tock();
        System.out.println("Time is 5 : " + vvv5);

    }
}
