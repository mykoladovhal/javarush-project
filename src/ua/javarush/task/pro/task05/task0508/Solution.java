package ua.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/* 
Видаляємо однакові рядки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишіть тут ваш код
        //strings = new String[]{"Hello", "Hello", "World", "Java", "Tasks", "World"};
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        Set<String> duplicate = Arrays.stream(strings)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        for (int i = 0; i < strings.length; i++) {
            strings[i] = duplicate.contains(strings[i]) ? null : strings[i];
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
