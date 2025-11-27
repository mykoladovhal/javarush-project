package ua.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублюємо текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        testString.printSomething();
        System.setOut(consoleStream);
        FileOutputStream outputStreamFile = new FileOutputStream(fileName);
        outputStreamFile.write(outputStream.toByteArray());
        outputStreamFile.close();
        System.out.println(outputStream);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

