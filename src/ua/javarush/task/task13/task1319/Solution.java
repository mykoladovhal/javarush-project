package ua.javarush.task.task13.task1319;

import java.io.*;

/* 
Записувач до файлу з консолі
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String nameFile, line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        nameFile = reader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        while (!(line = reader.readLine()).equals("exit")) stringBuilder.append(line).append("\n");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nameFile)));
        writer.write(stringBuilder.toString());
        writer.write("exit\n");
        reader.close();
        writer.close();
    }
}
