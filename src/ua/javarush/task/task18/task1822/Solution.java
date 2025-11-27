package ua.javarush.task.task18.task1822;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

/* 
Пошук даних усередині файлу
*/

public class Solution {
    public static void main(String[] args) {
        final String fA = args[0];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileInput = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())))) {
            System.out.println(fileInput.lines()
                    .map(s -> s.split(" "))
                    .filter(strings -> strings[0].equals(fA))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.joining(" ")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
