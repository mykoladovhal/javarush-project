package ua.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Виділяємо числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine(), file2 = reader.readLine();
        reader.close();
        BufferedReader readerFile = new BufferedReader(new FileReader(file1));
        BufferedWriter writerFile = new BufferedWriter(new FileWriter(file2));
        while (readerFile.ready()) {
            for (String s : readerFile.readLine().split(" ")) {
                try {
                  Integer.parseInt(s);
                  writerFile.write(s + " ");
                } catch (NumberFormatException _) {
                }
            }
        }
        writerFile.close();
        readerFile.close();
    }
}
