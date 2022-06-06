package com.javarush.task.pro.task06.task0618;

public class Solution {
    public static String material= "материальный";
    public static String immaterial= "нематериальный";

    public static void main(String[] args) {
        System.out.println("Из болота вылез нематериальный монстр...");

        //напишите тут ваш код
        switchSword(immaterial);
    }

    public static void switchSword(String str){
        System.out.print("Меч переключен в " + str + " режим.");
    }
}
