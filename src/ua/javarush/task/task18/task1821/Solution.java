package ua.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Зустрічаємо символи
*/

public class Solution {
    public static void main(String[] args) {
       // args = new String[]{"test"};

        try (FileInputStream fileInput = new FileInputStream(args[0])) {
            int[] allASCII = new int[128];
            while (fileInput.available() > 0) allASCII[fileInput.read()]++;
            for (int i = 0; i < allASCII.length; i++) {
                if (allASCII[i] != 0) System.out.printf("%c %d\n", i, allASCII[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
