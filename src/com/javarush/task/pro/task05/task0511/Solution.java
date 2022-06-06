package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int N = in.nextInt();
       multiArray = new int[N][];
       
       for (int i = 0; i < multiArray.length; i++){
           int n = in.nextInt();
           multiArray[i] = new int[n];
           for (int j = 0; j < n; j++){
               
               System.out.print(multiArray[i][j]);
               System.out.print(" ");
           }
           System.out.println();
       }
       
    }
}
