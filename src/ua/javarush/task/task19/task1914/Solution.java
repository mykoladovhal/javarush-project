package ua.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Вирішуємо приклад
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        testString.printSomething();
        System.setOut(consoleStream);

        String[] line = outputStream.toString().trim().split(" ");
        int result = 0;

        switch (line[1]) {
            case "+":
                result = Integer.parseInt(line[0]) + Integer.parseInt(line[2]);
                break;
            case "-":
                result = Integer.parseInt(line[0]) - Integer.parseInt(line[2]);
                break;
            case "*":
                result = Integer.parseInt(line[0]) * Integer.parseInt(line[2]);
                break;
            default:
                throw new IllegalArgumentException("Unknown operator: " + line[1]);
        }

        System.out.println(outputStream.toString() + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

