package ua.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Прогалини
*/

public class Solution {
    public static void main(String[] args) {
       // args = new String[]{"test"};
        try (FileInputStream fileInput = new FileInputStream(args[0])) {
            int b, count = 0, allByte = fileInput.available();
            while ((b = fileInput.read()) != -1) if (b == ' ') count++;
            if (allByte != 0) {
                double result = (double) count / allByte * 100;
                System.out.printf("%.2f", result);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
