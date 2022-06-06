package com.javarush.task.pro.task03.task0318;

import java.util.Scanner;

/* 
Био-мясо
*/

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        double hour0 = in.nextDouble();
        double minut0 = in.nextDouble();
        double hour = hour0 * 60;
        double minut = minut0 + hour;
        
        if (minut == 30){
            System.out.println(DONE);
        } else if (minut < 30){
            System.out.println(NOT_YET);
        } else if (minut > 30){
            System.out.println(HORRIBLY_DONE);
        }
        
    }
}
