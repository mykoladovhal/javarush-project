package ua.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Шукаємо потрібні рядки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = filereader.readLine();
        filereader.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.lines()
                .filter(line -> {
                    long matches = Arrays.stream(line.split("\\P{L}+"))
                            .filter(words::contains)
                            .count();
                    return matches == 2;
                })
                .forEach(System.out::println);
        reader.close();
    }
}
