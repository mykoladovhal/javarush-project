package ua.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* 
Парсер реквестів
*/

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String url = reader.readLine();
//        Pattern pattern = Pattern.compile("(?<=\\?|&)([^=&#]+)(?:=([^&#]*))?");
//        Map<String, String> params = pattern.matcher(url)
//                .results() // Поток объектов MatchResult
//                .collect(Collectors.toMap(
//                        mr -> mr.group(1),      // имя параметра
//                        mr -> mr.group(2) == null ? "" : mr.group(2)  // значение параметра (может быть null, если значение отсутствует)
//                ));
//        System.out.println(String.join(" ", params.keySet()));
//        params.entrySet().stream()
//                .filter(entry -> entry.getKey().equals("obj"))
//                .map(Map.Entry::getValue)
//                .findFirst()
//                .ifPresent(value -> {
//                    try {
//                        alert(Double.parseDouble(value));
//                    } catch (NumberFormatException _) {
//                        alert(value);
//                    }
//                });
//    }
//
//    public static void alert(double value) {
//        System.out.println("double: " + value);
//    }
//
//    public static void alert(String value) {
//        System.out.println("String: " + value);
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Чтение URL из консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        // Регулярное выражение для поиска параметров URL
        Pattern pattern = Pattern.compile("(?<=\\?|&)([^=&#]+)(?:=([^&#]*))?");
        Matcher matcher = pattern.matcher(url);

        // Создаем карту для хранения параметров (LinkedHashMap для сохранения порядка)
        Map<String, String> params = new LinkedHashMap<String, String>();
        while (matcher.find()) {
            String key = matcher.group(1);
            String value = matcher.group(2);
            if (value == null) {
                value = "";
            }
            params.put(key, value);
        }

        // Выводим ключи, разделенные пробелом
        StringBuilder keys = new StringBuilder();
        for (String key : params.keySet()) {
            if (keys.length() > 0) {
                keys.append(" ");
            }
            keys.append(key);
        }
        System.out.println(keys.toString());

        // Если есть параметр "obj", обрабатываем его
        if (params.containsKey("obj")) {
            String value = params.get("obj");
            try {
                // Пытаемся преобразовать значение в double
                double d = Double.parseDouble(value);
                alert(d);
            } catch (NumberFormatException e) {
                // Если не получается, вызываем alert(String)
                alert(value);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}