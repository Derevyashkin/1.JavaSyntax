package com.javarush.task.pro.task02.task0210;

/* 
С каждым разом огромнее
*/

public class Solution {

    public static void main(String[] args) {
        // объявляем переменную bigAmount типа String и присваиваем ей значение
        String bigAmount = "500";
        // объявляем переменную greatAmount типа String и присваиваем ей значение
        String greatAmount = "100000";

        // объявляем переменную hugeAmount типа int и присваиваем ей значение
        // суммы чисел из переменных bigAmount и greatAmount предварительно
        // преобразованных из строк с помощью метода parseInt класса Integer
        int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount);

        // выводим на экран значение переменной hugeAmount
        System.out.println(hugeAmount);
    }
}
