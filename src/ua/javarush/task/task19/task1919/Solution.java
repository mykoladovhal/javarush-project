package ua.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Рахуємо зарплати
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines()
                    .map(s -> s.split("\\s+"))
                    .collect(Collectors.toMap(s -> s[0], s -> Double.parseDouble(s[1]), Double::sum, TreeMap::new))
                    .forEach((s, aDouble) -> System.out.printf("%s %s%n", s, aDouble));

        } catch (IOException _) {
        }
    }
}
