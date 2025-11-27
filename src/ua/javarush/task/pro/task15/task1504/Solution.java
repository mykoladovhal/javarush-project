package ua.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Переплутані байти
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            while (inputStream.available() > 0) {
                int firstByte = inputStream.read();
                if (firstByte == -1) {
                    break;
                }
                int secondByte = inputStream.read();
                if (secondByte == -1) {
                    outputStream.write(firstByte);
                    break;
                }
                outputStream.write(secondByte);
                outputStream.write(firstByte);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

