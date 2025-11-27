package ua.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортування парних чисел із файлу
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        bufferedReader.lines()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0)
                .sorted(Comparator.comparingInt(Integer::intValue))
                .forEach(System.out::println);
        reader.close();
        bufferedReader.close();
    }
}
