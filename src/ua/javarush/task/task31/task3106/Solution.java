package ua.javarush.task.task31.task3106;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* 
Розархівуємо файл
*/

public class Solution {
    public static void main(String[] args) {
        String resultFileName = args[0];
        List<InputStream> parts = Arrays.stream(args).skip(1)
                .sorted(Comparator.comparingInt(name -> {
                    String[] partsTmp = name.split("\\.");
                    return Integer.parseInt(partsTmp[partsTmp.length - 1]);
                }))
                .map(name1 -> {
                    try {
                        return new FileInputStream(name1);
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList());
        try (
                SequenceInputStream zipParts = new SequenceInputStream(Collections.enumeration(parts));
                ZipInputStream zipInput = new ZipInputStream(zipParts);
                FileOutputStream output = new FileOutputStream(resultFileName)
        ) {
            ZipEntry entry = zipInput.getNextEntry(); // внутри zip только один файл
            byte[] buffer = new byte[8192];
            int len;
            while ((len = zipInput.read(buffer)) != -1) {
                output.write(buffer, 0, len);
            }
            zipInput.closeEntry(); // важно
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
