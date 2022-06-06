package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        Scanner  in = new Scanner(System.in);
        int a = 1;
        String name = in.nextLine();
        
        while (a <= 10){
            System.out.println(name + text);
            a++;
        }

    }
}
