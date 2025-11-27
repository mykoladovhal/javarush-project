package ua.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаємо з потоку
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter stringWriter = new StringWriter();
        int ch;
        if (is != null) {
            while ((ch = is.read()) != -1) {
                stringWriter.append((char) ch);
            }
        }
        return stringWriter;
    }
}
