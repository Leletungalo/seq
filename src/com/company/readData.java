package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readData {
    private String fileName;
    private int numberOfTree;
    private ArrayList<Double> totalsForTrees;

    public readData(String fileName){
        this.fileName = fileName;
    }

    public void CalculateAvrg(){
        File file = new File(fileName);
        double[][] data ;
        try {
            Scanner scan = new Scanner(file);
            int x = scan.nextInt();
            int y = scan.nextInt();
            data = new double[x][y];
            scan.nextLine();
            for (int row =0 ; row < x ; row++ ){
                for (int cal = 0; cal < y ; cal++){
                    data [row][cal] = Double.parseDouble(scan.next());
                }
            }
            scan.nextLine();
            numberOfTree = scan.nextInt();
            totalsForTrees = new ArrayList<>(numberOfTree);
            scan.nextLine();

            int xofTree;
            int yOfTree;
            int treeLength;
            for (int i = 0; i < numberOfTree;i++){
                xofTree = scan.nextInt();
                yOfTree = scan.nextInt();
                treeLength = scan.nextInt();

                int xr = xofTree;
                int yr = yOfTree;
                double totalForATree = 0;

                    for (int z = 0 ; z < treeLength;z++){
                        try {
                        for (int l = 0 ;l < treeLength;l++){
                        double ssss = data[xofTree][yOfTree];
                        totalForATree += ssss;
                        yOfTree++;}
                        }catch (ArrayIndexOutOfBoundsException e){ }
                        yOfTree = yr;
                        xofTree = xr + 1;
                        xr++;
                    }

               totalsForTrees.add(totalForATree);

            }
           System.out.println(totalsForTrees.toString());

        }catch (FileNotFoundException e){
            System.out.println("not found");
            e.getStackTrace();
        }
    }

    public void countMean(){

        float tot = 0;
        for (double x:totalsForTrees) {
            tot += x;
        }
        System.out.println(tot / numberOfTree);
    }
}
