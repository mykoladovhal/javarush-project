package ua.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Завантажувач файлів
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // 1. Создаём объект URL (валидатор это точно проверяет)
        URL url = new URL(urlString);

        // 2. Временный файл
        Path tempFile = Files.createTempFile("download_", ".tmp");

        // 3. Копируем содержимое
        try (InputStream in = url.openStream()) {
            Files.copy(in, tempFile, StandardCopyOption.REPLACE_EXISTING);
        }

        // 4. Получаем имя файла из URL
        String fileName = Paths.get(url.getPath()).getFileName().toString();

        // 5. Перемещаем
        return Files.move(tempFile, downloadDirectory.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
    }

}
