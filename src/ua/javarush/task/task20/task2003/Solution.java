package ua.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знайомство з properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        //напишіть тут ваш код
        Properties properties = new Properties();
        properties.putAll(runtimeStorage);
        properties.store(outputStream, "Saved from HashMap");

    }

    public static void load(InputStream inputStream) throws IOException {
        //напишіть тут ваш код
        runtimeStorage.clear();
        Properties properties = new Properties();
        properties.load(inputStream);
        for (String key : properties.stringPropertyNames()) {
            runtimeStorage.put(key, properties.getProperty(key));
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
