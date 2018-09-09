package com.company;

public class Main {

    static long startTime = 0;

    private static void tick(){
        startTime = System.currentTimeMillis();
    }
    private static float tock(){
        return (System.currentTimeMillis() - startTime) / 1000.0f;
    }
    /*static final ForkJoinPool fjPool = new ForkJoinPool();
    static int sum(int[] arr){
        return fjPool.invoke(new SumArray(arr,0,arr.length));
    }*/

    public static void main(String[] args) {
        if (args.length > 0){
        tick();
            readData readData = new readData("sample_input.txt"/*args[0]*/);
            float nun = tock();
            System.out.println("Time is : " + nun);
            tick();
            readData.CalculateAvrg();
            readData.countMean();
            float vvv = tock();
        System.out.println("Time is : " + vvv);
        }else
            System.out.println("nothing");

        //*readData readData = new readData("sample_input.txt");



    }
}
