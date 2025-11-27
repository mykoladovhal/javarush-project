package ua.javarush.task.task18.task1819;

import java.io.*;

/* 
Об'єднання файлів
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // Считывание имён файлов
            String nameFile1 = reader.readLine();
            String nameFile2 = reader.readLine();

            // Создание потока для накопления байт из обоих файлов
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            // Считывание второго файла и запись в outputStream
            readFileToStream(nameFile2, outputStream);

            // Считывание первого файла и запись в outputStream
            readFileToStream(nameFile1, outputStream);

            // Перезапись первого файла объединенными данными
            try (FileOutputStream fileOutput = new FileOutputStream(nameFile1)) {
                outputStream.writeTo(fileOutput);
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка ввода-вывода", e);
        }
    }

    /**
     * Считывает содержимое файла по указанному пути и записывает его в ByteArrayOutputStream.
     *
     * @param fileName Имя файла для чтения
     * @param stream   Поток, в который будут записаны считанные байты
     * @throws IOException При ошибках ввода-вывода
     */
    private static void readFileToStream(String fileName, ByteArrayOutputStream stream) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1024]; // Использование буфера для чтения файла по частям
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                stream.write(buffer, 0, bytesRead);
            }
        }
    }
}
