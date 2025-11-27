package ua.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одному
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fileOutput = new FileOutputStream(reader.readLine());
             FileInputStream fileInput1 = new FileInputStream(reader.readLine());
             FileInputStream fileInput2 = new FileInputStream(reader.readLine())) {
            byte[] allByte = new byte[fileInput1.available()];
            fileInput1.read(allByte);
            fileOutput.write(allByte);
            allByte = new byte[fileInput2.available()];
            fileInput2.read(allByte);
            fileOutput.write(allByte);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
