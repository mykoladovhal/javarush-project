package ua.javarush.task.pro.task13.task1304;

import java.util.*;

/* 
Перетворюємо ітератор на цикл for-each
*/

public class Solution {

    public static void printList(ArrayList<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Гадаю, це буде нова фіча. Тільки нікому не кажіть, що вона виникла випадково.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
