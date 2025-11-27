package ua.javarush.task.task18.task1807;

import java.io.*;

/* 
Підрахунок ком.
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); FileInputStream fileInput = new FileInputStream(reader.readLine())) {
            int count = 0;
            while (fileInput.available() > 0) if (fileInput.read() == ',') count++;
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
