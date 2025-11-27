package ua.javarush.task.task31.task3102;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* 
Знаходимо всі файли
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> result = new ArrayList<>();
        Path path = Paths.get(root);
        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (attrs.isRegularFile()) result.add(file.toString());
                return FileVisitResult.CONTINUE;
            }
        });
        return result;
    }

    public static void main(String[] args) {
       /* try {
            getFileTree("/Users/mikoladovgal/javarush/3533672/javarush-project").forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
