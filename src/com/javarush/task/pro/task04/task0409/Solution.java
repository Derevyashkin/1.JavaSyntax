package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        
        int min = Integer.MAX_VALUE;
        
        while (in.hasNextInt()){
           int num = in.nextInt();
           
            
            if(num < min){
                min = num;
            }
            
        }
        System.out.println(min);

    }
}