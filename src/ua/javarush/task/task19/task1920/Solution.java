package ua.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/* 
Найбагатший
*/

public class Solution {
    public static void main(String[] args) {
       // String fileName = "test";
        String fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines()
                    .map(s -> s.split("\\s+")).
                    collect(Collectors.toMap(s -> s[0], s -> Double.parseDouble(s[1]), Double::sum, TreeMap::new))
                    .entrySet().stream()
                    .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.groupingBy(Map.Entry::getKey, Collectors.toSet())))
                    .entrySet().stream().max(Map.Entry.comparingByKey())
                    .ifPresent(doubleMapEntry -> doubleMapEntry.getValue().keySet().forEach(System.out::println));

        } catch (IOException _) {
        }
    }
}
