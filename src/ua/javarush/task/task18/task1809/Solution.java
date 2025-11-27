package ua.javarush.task.task18.task1809;

import java.io.*;
import java.util.*;

/* 
Реверс файлу
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInput = new FileInputStream(reader.readLine());
             FileOutputStream fileOutput = new FileOutputStream(reader.readLine())) {
            byte[] allFile = new byte[fileInput.available()];
            fileInput.read(allFile);
            reverseArray(allFile);
            fileOutput.write(allFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void reverseArray(byte[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            byte temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
