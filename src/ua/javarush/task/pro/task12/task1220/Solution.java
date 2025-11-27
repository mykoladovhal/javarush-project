package ua.javarush.task.pro.task12.task1220;

import java.util.ArrayList;

/* 
Мисливці за привидом: у гонитві за типами
*/

public class Solution {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привіт");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        //напишіть тут ваш код
        for (Object element : elements) {
            if (element instanceof String) printString();
            else if (element instanceof Integer)  printInteger();
            else if (element instanceof Integer[]) printIntegerArray();
            else printUnknown();

        }
    }

    public static void printString() {
        System.out.println("Рядок");
    }

    public static void printInteger() {
        System.out.println("Ціле число");
    }

    public static void printIntegerArray() {
        System.out.println("Масив цілих чисел");
    }

    public static void printUnknown() {
        System.out.println("Інший тип даних");
    }
}
