package ua.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/* 
Сортування байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInput = new FileInputStream(reader.readLine());
        TreeSet<Byte> result = new TreeSet<>();
        while (fileInput.available() > 0) result.add((byte) fileInput.read());
        fileInput.close();
        reader.close();
        System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
