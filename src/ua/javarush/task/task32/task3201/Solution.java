package ua.javarush.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Запис до існуючого файлу
*/

public class Solution {
    public static void main(String... args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            Long position = Long.parseLong(args[1]);
            long length = raf.length();
            raf.seek(Math.min(position, length));
            /*if (position> raf.length()) raf.seek(raf.length());
            else raf.seek(position);*/
            raf.write(args[2].getBytes());
        }
        catch (Exception ignore) {}
    }
}
