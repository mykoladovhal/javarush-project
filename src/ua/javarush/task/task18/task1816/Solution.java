package ua.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Англійські літери
*/

public class Solution {
    public static void main(String[] args) {
        //args = new String[] {"test"};
        try (FileInputStream fileInput = new FileInputStream(args[0])) {
            int b, count = 0;
            while ((b = fileInput.read()) != -1) {
                if ((b >= 'A' && b <= 'Z') || (b >= 'a' && b <= 'z')) count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
