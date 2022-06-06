package com.javarush.task.pro.task02.task0216;

/* 
Генератор позитивных новостей
*/

public class Solution {
    public static void main(String[] args) {
        // объявляем переменные типа String и сразу же в строке объявления
        // присваиваем им значения
        String name = "Амиго";
        String date = "01 01 3210";
        String time = "12:00";
        String noun = "процессор";
        String adjective = "квантовый";
        String verb = "обрабатывает";

        // выводим на экран текст "Новости:" и переводим курсор на новую строку
        System.out.println("Новости:");
        // складываем (конкатенируем) из строк и значений стрковых переменных
        // фразу и выводим ее на экран
        System.out.println(name + " " + date + " " + time + " изобрел " + adjective +
                " " + noun + " который " + verb + " террабайты данных в минуту.");
    }
}
