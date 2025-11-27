package ua.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        while (true) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                 FileInputStream fileInput = new FileInputStream(reader.readLine())) {
                if (fileInput.available() < 1000) throw new DownloadException();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
