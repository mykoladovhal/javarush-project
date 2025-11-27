package ua.javarush.task.pro.task13.task1302;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Перевірка наявності
*/

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Якби мене попросили вибрати мову взамін на Java, я б не вибирав".split(" ")));

    public static void checkWords(String word) {
        //напишіть тут ваш код
        words.stream()
                .map(s -> s.replaceAll("[^a-zA-Zа-яА-ЯїЇєЄіІ]+", ""))
                .filter(s -> s.equals(word))
                        .findAny().ifPresent(s -> System.out.println());
        // System.out.printf("Слово %s %s в множині\n", word, words.contains(word) ? "є" : "немає");

    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
