package ua.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пропускаємо не всіх
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        var count = new AtomicInteger(0);
        Files.readAllLines(Path.of(new Scanner(System.in).nextLine()))
                .stream()
                .filter(line -> count.incrementAndGet() % 2 != 0)
                .forEach(System.out::println);

    }
}

