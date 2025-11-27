package ua.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* 
Прохід деревом файлів
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File path = new File(args[0]), file = new File(args[1]);
        File newFile = new File(file.getParent() + "/allFilesContent.txt");

        if (FileUtils.isExist(newFile)) FileUtils.deleteFile(newFile);
        if (FileUtils.isExist(file)) FileUtils.renameFile(file, newFile);

        try (FileOutputStream outputStream = new FileOutputStream(newFile)) {
            Files.walkFileTree(path.toPath(), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
                    File currentFile = path.toFile();

                    if (currentFile.isFile()
                            && currentFile.length() <= 50
                            && currentFile.getName().toLowerCase().endsWith(".txt")
                            && !currentFile.getAbsolutePath().equals(newFile.getAbsolutePath())) {

                        try (FileInputStream inputStream = new FileInputStream(currentFile)) {
                            byte[] buffer = new byte[1024];
                            int bytesRead;
                            while ((bytesRead = inputStream.read(buffer)) != -1) {
                                outputStream.write(buffer, 0, bytesRead);
                            }
                        }

                        outputStream.write('\n');
                    }

                    return FileVisitResult.CONTINUE;
                }
            });
        }
    }
}