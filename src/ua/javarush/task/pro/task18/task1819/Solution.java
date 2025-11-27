package ua.javarush.task.pro.task18.task1819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/* 
Як бути, якщо в списку є елемент null
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Цей елемент дорівнює null";
        //напишіть тут ваш код
        list.stream().map(Optional::ofNullable).forEach(s -> System.out.println(s.orElse(text)));
    }
}
