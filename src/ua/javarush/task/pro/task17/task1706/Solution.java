package ua.javarush.task.pro.task17.task1706;

/* 
Хижаки й травоїдні
*/

public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal) {
        String herbivore = "Любить траву";
        String predator = "Любить м'ясо";

        //напишіть тут ваш код
        System.out.println((animal instanceof Herbivore) ? herbivore : predator);
    }
}
