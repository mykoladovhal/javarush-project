package ua.javarush.task.pro.task17.task1703;

import java.util.ArrayList;

/* 
Космічна одіссея ч. 1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        //напишіть тут ваш код
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Cat());
        astronauts.add(new Dog());
    }

    public static void printCrewInfo() {
        System.out.println("На борт прибули члени екіпажу: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
