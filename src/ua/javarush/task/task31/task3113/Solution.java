package ua.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Що всередині папки?
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String investigateDirectory = reader.readLine();
        reader.close();
        AtomicInteger countFiles = new AtomicInteger(), countDirectories = new AtomicInteger(-1);
        AtomicLong totalSize = new AtomicLong();
        Path path = Paths.get(investigateDirectory);
        if (!Files.isDirectory(path)) {
            System.out.printf("%s - не папка", path.toAbsolutePath());
            return;
        }
        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                countDirectories.incrementAndGet();
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                countFiles.incrementAndGet();
                totalSize.addAndGet(attrs.size());
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println("Загалом папок - " + countDirectories.get());
        System.out.println("Загалом файлів - " + countFiles.get());
        System.out.println("Загальний розмір - " + totalSize.get());
    }
}
