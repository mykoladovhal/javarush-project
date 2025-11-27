package ua.javarush.task.task12.task1204;

/* 
Чи то птах, чи то лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //напишіть тут ваш код
        if (o instanceof Cat) System.out.println("Кішка");
        else if (o instanceof Dog) System.out.println("Собака");
        else if (o instanceof Bird) System.out.println("Птах");
        else if (o instanceof Lamp) System.out.println("Лампа");

    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
