package ua.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Контекстна реклама
*/

public class Solution {
    public static TestString testString = new TestString();


    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        testString.printSomething();
        System.setOut(consoleStream);
        Scanner scanner = new Scanner(outputStream.toString());
        int count = 0;
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
            count++;
            if (count % 2 == 0) System.out.println("JavaRush - курси Java онлайн");
        }
    }


    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
