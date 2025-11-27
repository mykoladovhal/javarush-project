package ua.javarush.task.task18.task1820;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

/* 
Округлення чисел
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInput = new FileInputStream(reader.readLine());
             FileOutputStream fileOutput = new FileOutputStream(reader.readLine())) {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInput));
            byte[] allByte = bufferedReader.lines()
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .map(Double::parseDouble)
                    .map(Math::round)
                    .map(String::valueOf)
                    .collect(Collectors.joining(" "))
                    .getBytes();
            fileOutput.write(allByte);
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
