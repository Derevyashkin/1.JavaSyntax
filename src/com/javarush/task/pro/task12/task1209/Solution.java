package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<String>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<String>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Нифрод");
        for(int i = 0; i < waitingEmployees.size(); i++){
            System.out.println(waitingEmployees.get(i));
        }
        for(int i = 0; i < alreadyGotSalaryEmployees.size(); i++){
            System.out.println(alreadyGotSalaryEmployees.get(i));
        }
    }

    public static void paySalary(String name) {
        //напишите тут ваш код
        for(int i = 0; i < waitingEmployees.size(); i++){
            if(waitingEmployees.get(i) == name){
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(i, null);
            }
            
        }
        
    }
}
