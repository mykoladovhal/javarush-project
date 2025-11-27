package ua.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/* 
Тільки по черзі!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //напишіть тут ваш код
        t1.start();
        t1.join();
        t2.start();
        t2.join();


        t1.printResult();
        t2.printResult();
    }

    //напишіть тут ваш код
    public static class Read3Strings extends Thread {
        public String trim;
        private StringBuilder line = new StringBuilder();

        @Override
        public void run() {
            int count = 3;
            while (count-- > 0) {
                try {
                    line.append(reader.readLine()).append(" ");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            trim = line.toString().trim();

        }

        public void printResult() {
            System.out.println(this.trim);
        }
    }
}
