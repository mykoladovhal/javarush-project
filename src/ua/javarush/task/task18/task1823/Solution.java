package ua.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Потоки та байти
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName;
            while (!(fileName = reader.readLine()).equals("exit")) {
                new ReadThread(fileName);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            // implement constructor body
            this.fileName = fileName;
            start();
        }
        // implement file reading here - реалізуйте читання з файлу тут

        @Override
        public void run() {
            try (FileInputStream fileInput = new FileInputStream(fileName)) {
                int[] allByte = new int[256];
                int byteValue;
                while ((byteValue = fileInput.read()) != -1) allByte[byteValue]++;

                int frequency = allByte[0], maxCountByte = 0;
                for (int i = 0; i < allByte.length; i++) {
                    if (allByte[i] > frequency) {
                        frequency = allByte[i];
                        maxCountByte = i;
                    }
                    synchronized (resultMap) {
                        resultMap.put(fileName, maxCountByte);
                    }
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
