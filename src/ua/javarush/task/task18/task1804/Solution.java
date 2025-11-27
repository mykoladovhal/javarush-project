package ua.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Найрідкісніші байти
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int[] minByte = new int[256];
        while (fileInputStream.available() > 0) minByte[fileInputStream.read()]++;
        int min = Arrays.stream(minByte).filter(value -> value > 0).min().orElse(0);
        for (int i = 0; i < minByte.length; i++) {
            if (minByte[i] == min) System.out.print(i + " ");
        }
        reader.close();
        fileInputStream.close();
    }
}
