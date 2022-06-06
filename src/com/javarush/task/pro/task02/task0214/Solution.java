package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        String odin = in.nextLine();
        String dva = in.nextLine();
        String tri = in.nextLine();
        
        System.out.println(tri);
        System.out.println(dva.toUpperCase());
        System.out.println(odin.toLowerCase());
     

    }
}
