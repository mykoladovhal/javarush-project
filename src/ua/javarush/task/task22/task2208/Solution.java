package ua.javarush.task.task22.task2208;

import java.util.Map;
import java.util.stream.Collectors;

/* 
Формуємо WHERE
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String getQuery(Map<String, String> params) {
       return params.entrySet().stream()
                .filter(stringStringEntry -> stringStringEntry.getValue() != null)
                .map(stringStringEntry -> String.format("%s = '%s'", stringStringEntry.getKey(), stringStringEntry.getValue()))
                .collect(Collectors.joining(" and "));
    }
}
