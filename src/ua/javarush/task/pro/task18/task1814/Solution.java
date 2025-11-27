package ua.javarush.task.pro.task18.task1814;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Без повторів
*/

public class Solution {

    public static void main(String[] args) {
        var words = new ArrayList<String>();
        Collections.addAll(words, "щоб", "стати", "програмістом", "потрібно", "програмувати",
                "а", "щоб", "програмувати", "потрібно", "вчитися");

        Stream<String> distinctWords = getDistinctWords(words);
        distinctWords.forEach(System.out::println);
    }

    public static Stream<String> getDistinctWords(ArrayList<String> words) {
        //напишіть тут ваш код
        return words.stream().distinct();
    }
}
