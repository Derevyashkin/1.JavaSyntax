package com.javarush.task.pro.task10.task1015;

/* 
Ежик и яблоко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple ap1 = new Apple();
        Hedgehog he1 = new Hedgehog();
        he1.eat(ap1);
    }

    public static class Apple {
    }
}
