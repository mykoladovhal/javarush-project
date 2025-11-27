package ua.javarush.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Виправити помилки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Створюємо потік-запису-байтів-у-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        if (inputStream.available() > 0) {
            // Читаємо весь файл одним шматком
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
