package ua.javarush.task.task12.task1205;

/* 
Визначимося з твариною
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишіть тут ваш код
        if (o instanceof Cow) return "Корова";
        if (o instanceof Dog) return "Собака";
        if (o instanceof Whale) return "Кит";
        return "Невідома тварина";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
