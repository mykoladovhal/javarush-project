package ua.javarush.task.pro.task18.task1801;

import java.util.ArrayList;

/* 
Дві реалізації одного інтерфейсу
*/

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        //напишіть тут ваш код
        list.add(runnable);
    }

    public static void runList() {
        //напишіть тут ваш код
        list.forEach(Runnable::run);
    }
}