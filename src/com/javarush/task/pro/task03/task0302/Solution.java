package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextInt();
        
        if (age >= 18 && age <= 28)
            System.out.println(name + ", явитесь в военкомат");
        else 
            in.close();
        
    }
}