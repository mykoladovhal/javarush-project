package ua.javarush.task.pro.task17.task1705;

import java.util.ArrayList;

/* 
Космічна одіссея ч. 3
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        //напишіть тут ваш код
        astronauts.forEach(astronaut -> {
            if (astronaut instanceof Human) pilot((Human) astronaut);
            else if (astronaut instanceof Dog) createDirection((Dog) astronaut);
            else if (astronaut instanceof Cat) research((Cat) astronaut);
        });
    }

    public static void pilot(Human human) {
        System.out.println("Член екіпажу " + human.getInfo() + " пілотує корабель.");
    }

    public static void createDirection(Dog dog) {
        System.out.println("Член екіпажу " + dog.getInfo() + " займається створенням навігаційного маршруту.");
    }

    public static void research(Cat cat) {
        System.out.println("Член екіпажу " + cat.getInfo() + " досліджує найближчі планети.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт прибули члени екіпажу: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
