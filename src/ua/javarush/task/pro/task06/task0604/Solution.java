package ua.javarush.task.pro.task06.task0604;

/* 
Ліверпульська четвірка
*/

public class Solution {
    public static void main(String[] args) {
        String navigator = "Джон";
        String pilot = "Пол";
        String secondPilot = "Джордж";
        String flightEngineer = "Рінго";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
        System.out.println("Четвірка, яка має підкорити космос:");
        System.out.println("Штурман: " + navigator);
        System.out.println("Пілот: " + pilot);
        System.out.println("Другий пілот: " + secondPilot);
        System.out.println("Бортінженер: " + flightEngineer);
    }
}
