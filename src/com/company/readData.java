package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readData {
    private int numberOfTree;
    private double totalForAllTree;
    private ArrayList<Double> totalsForTrees;

    public readData(String fileName){
        File file = new File(fileName);
        double[][] data;
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
            totalForAllTree = 0;

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
                totalForAllTree += totalForATree;

                totalsForTrees.add(totalForATree);
            }
        }catch (FileNotFoundException e){
            System.out.println("not found");
            e.getStackTrace();
        }
    }

    /**returns an arrayList with all the total for the trees.
     */
    public ArrayList<Double> getTotalForAllTree(){
        return totalsForTrees;
    }
    /**Calculate the mean the all the the tree
     * */
    public Double countMean(){
        return  (totalForAllTree / numberOfTree);
    }

    public int getNumberOfTree() {
        return numberOfTree;
    }
}
