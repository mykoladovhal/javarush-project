package ua.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифрування
*/

public class Solution {
    public static void main(String[] args) {
      //  args = new String[]{"-e", "test1.txt", "test2.txt"};
        try (FileInputStream fileInput = new FileInputStream(args[1]);
             FileOutputStream fileOutput = new FileOutputStream(args[2])) {
            while (fileInput.available() > 0) fileOutput.write(fileInput.read() ^ 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
