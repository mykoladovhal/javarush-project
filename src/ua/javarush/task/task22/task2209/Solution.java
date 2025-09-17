package ua.javarush.task.task22.task2209;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/* 
Скласти ланцюжок слів
*/

public class Solution {
    public static void main(String[] args) {
        //...
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] words = Files.readAllLines(Paths.get(reader.readLine()))
                    .stream()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .toArray(String[]::new);
            StringBuilder result = getLine(words);
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static StringBuilder getLine(String... words) {
        if (words.length == 0) return new StringBuilder();
        List<String> list = new ArrayList<>(Arrays.asList(words));
        StringBuilder result = new StringBuilder(list.removeFirst());

        boolean change;
        do {
            change = false;
            ListIterator<String> it = list.listIterator();
            while (it.hasNext()) {
                String word = it.next();
                char first = Character.toLowerCase(result.charAt(0)),
                        second = Character.toLowerCase(result.charAt(result.length() - 1));
                if (word.toLowerCase(Locale.ROOT).charAt(0) == second) {
                    result.append(" ").append(word);
                    it.remove();
                    change = true;
                } else if (word.toLowerCase(Locale.ROOT).charAt(word.length() - 1) == first) {
                    result.insert(0, " ").insert(0, word);
                    it.remove();
                    change = true;
                }
            }
        } while (change);
        list.forEach(s -> result.append(" ").append(s));
        return result;
    }
}
