package ua.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Збираємо файл
*/

//public class Solution {
//    public static void main(String[] args) {
//
//        List<String> fileParts = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            String line;
//            while (!(line = reader.readLine()).equals("end")) fileParts.add(line);
//            String writeFile = fileParts.getFirst().replaceAll("\\.part\\d+$", "");
//            fileParts.sort(Comparator.comparingInt(s -> Integer.parseInt(s.replaceAll(".*?(\\d+)$", "$1"))));
//            FileOutputStream fileOutput = new FileOutputStream(writeFile);
//            for (String filePart : fileParts) {
//                FileInputStream fileInput = new FileInputStream(filePart);
//                fileOutput.write(fileInput.readAllBytes());
//                fileInput.close();
//            }
//            fileOutput.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> fileParts = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null && !line.equals("end")) {
            fileParts.add(line);
        }
        reader.close();

        if (fileParts.isEmpty()) return;

        // сортировка (Java 8+)
        fileParts.sort(Comparator.comparingInt(
                s -> Integer.parseInt(s.replaceAll(".*?(\\d+)$", "$1"))
        ));

        String writeFile = fileParts.get(0).replaceAll("\\.part\\d+$", "");

        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(writeFile))) {
            byte[] buf = new byte[8192];
            for (String part : fileParts) {
                try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(part))) {
                    int len;
                    while ((len = in.read(buf)) != -1) {
                        out.write(buf, 0, len);
                    }
                }
            }
        }
    }
}