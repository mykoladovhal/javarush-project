package ua.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Найчастіші байти
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int[] maxByte = new int[256];
        while (fileInputStream.available() > 0) maxByte[fileInputStream.read()]++;
        int max = Arrays.stream(maxByte).max().getAsInt();
        for (int i = 0; i < maxByte.length; i++) {
            if (maxByte[i] == max) System.out.print(i + " ");
        }
        fileInputStream.close();
        reader.close();
    }
}
