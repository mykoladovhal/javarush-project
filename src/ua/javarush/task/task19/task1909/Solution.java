package ua.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Заміна знаків
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine(), file2= reader.readLine();
        reader.close();
        BufferedReader readerFile = new BufferedReader(new FileReader(file1));
        BufferedWriter writerFile = new BufferedWriter(new FileWriter(file2));
        while (readerFile.ready()) {
            writerFile.write(readerFile.readLine().replaceAll("\\.", "!"));
            writerFile.newLine();
        }
        writerFile.close();
        readerFile.close();
    }
}
