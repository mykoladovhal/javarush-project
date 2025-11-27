package ua.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Заміна чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "нуль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "чотири");
        map.put(5, "п'ять");
        map.put(6, "шість");
        map.put(7, "сім");
        map.put(8, "вісім");
        map.put(9, "дев'ять");
        map.put(10, "десять");
        map.put(11, "одинадцять");
        map.put(12, "дванадцять");
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b(?:[0-9]|1[0-2])\\b");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader readerFile = new BufferedReader(new FileReader(reader.readLine()))) {
            readerFile.lines()
                    .forEach(line -> {

                        Matcher matcher = pattern.matcher(line);
                        StringBuffer result = new StringBuffer();

                        while (matcher.find()) {
                            int number = Integer.parseInt(matcher.group());
                            matcher.appendReplacement(result, map.get(number));
                        }
                        matcher.appendTail(result);
                        System.out.println(result);
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
