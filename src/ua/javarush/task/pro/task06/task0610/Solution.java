package ua.javarush.task.pro.task06.task0610;

/* 
Боротьба за доступ
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person("Петро", "Петренко");
        System.out.println("Досьє.");
        System.out.println("Ім'я: " + person.getFirstName());
        System.out.println("Прізвище: " + person.getLastName());
        System.out.println("Повне ім'я: " + person.getFullName());
    }
}
