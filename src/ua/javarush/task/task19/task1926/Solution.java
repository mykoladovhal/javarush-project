package ua.javarush.task.task19.task1926;

import java.io.*;

/* 
Перевертень
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader readerFile = new BufferedReader(new FileReader(reader.readLine()))) {
            readerFile.lines().forEach(line -> {
                String reversed = new StringBuilder(line).reverse().toString();
                System.out.println(reversed);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
