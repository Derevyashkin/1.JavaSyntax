package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int w = in.nextInt();
        int e = in.nextInt();
        
        System.out.println((q + w + e)/3);

    }
}
