package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int speedMC = in.nextInt();
        int speedKM = (int)Math.round(speedMC * 3.6);
        System.out.print(speedKM);

    }
}