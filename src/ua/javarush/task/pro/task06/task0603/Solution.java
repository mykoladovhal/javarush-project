package ua.javarush.task.pro.task06.task0603;

/* 
Улюблена страва
*/

public class Solution {

    public static void main(String[] args) {
        String firstName = "Даша";
        String lastName = "Євтух";
        String favouriteDish = "Борщ";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("Коротке досьє:");
        System.out.println("Ім'я: " + name);
        System.out.println("Прізвище: " + surname);
        System.out.println("Улюблена страва: " + meal);
    }
}
