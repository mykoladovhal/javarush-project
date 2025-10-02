package ua.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Зміна кодування
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader fileInputStream = new InputStreamReader(new FileInputStream(args[0]), Charset.forName("Windows-1251"));
             OutputStreamWriter fileOutputStream = new OutputStreamWriter(new FileOutputStream(args[1]), StandardCharsets.UTF_8)) {
            int charsRead;
            char[] buff = new char[8192];
            while ((charsRead = fileInputStream.read(buff)) != -1) {
                fileOutputStream.write(buff, 0, charsRead);
            }
        }
    }
}
