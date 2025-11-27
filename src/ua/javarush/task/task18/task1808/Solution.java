package ua.javarush.task.task18.task1808;

import java.io.*;

/* 
Поділ файлу
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInput = new FileInputStream(reader.readLine());
             FileOutputStream fileOutput1 = new FileOutputStream(reader.readLine());
             FileOutputStream fileOutput2 = new FileOutputStream(reader.readLine())) {
            int fileLong = fileInput.available();
            while (fileInput.available() > 0) {
                if (fileInput.available() > fileLong / 2) fileOutput1.write(fileInput.read());
                else fileOutput2.write(fileInput.read());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
