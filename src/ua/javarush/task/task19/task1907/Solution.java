package ua.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Зчитуємо слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
        long count = readerFile.lines()
                .flatMap(s -> Arrays.stream(s.split("[\\p{Punct}\\s]+")))
                .filter(s -> s.equals("world"))
                .count();
        readerFile.close();
        System.out.println(count);
    }
}
