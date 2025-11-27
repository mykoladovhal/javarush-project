package ua.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.UUID;

/* 
Тимчасове збереження файлу
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //напишіть тут ваш код
        URL url = new URL(line);
        InputStream stream = url.openStream();
        Path path = Files.createTempFile(null, null);
        Files.write(path, stream.readAllBytes());

    }
}