package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        
        while(true){
            String abc = in.nextLine();
           
            if (abc.equals("enough"))
            break;
            System.out.println(abc);
        }

    }
}