package ua.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Переміщення файлів
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишіть тут ваш код
        Files.newDirectoryStream(sourceDirectory).forEach(path -> {
            if (Files.isRegularFile(path)) {
                try {
                    Files.move(path, targetDirectory.resolve(path.getFileName()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

