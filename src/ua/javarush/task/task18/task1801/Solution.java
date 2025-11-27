package ua.javarush.task.task18.task1801;

import java.io.*;
import java.util.Arrays;


/*
Максимальний байт
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            int max = Byte.MIN_VALUE;
            while (fileInputStream.available() > 0) {
                int current = fileInputStream.read();
                if (current > max) max = current;
            }
            System.out.println(max);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
