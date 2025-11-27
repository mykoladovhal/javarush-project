package ua.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/* 
Довгі слова
*/

public class Solution {
    public static void main(String[] args) {
       // args = new String[]{"test", "test1.txt"};
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter fileWriter = new FileWriter(args[1])) {
            String result = reader.lines().flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .filter(word -> word.length() > 6)
                    .collect(Collectors.joining(","));
            fileWriter.write(result);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
