package ua.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        try {
            Files.readAllLines(Path.of(new Scanner(System.in).nextLine()))
                    .stream()
                    .map(line -> line.replaceAll("[.,\\s]", ""))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

