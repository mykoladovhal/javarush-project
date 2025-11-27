package ua.javarush.task.pro.task04.task0408;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Максимум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                int line = scan.nextInt();
                list.add(line);

            } catch (Exception ignore) {
                break;
            }
        }
        scan.close();
        list.stream()
                .filter(num -> num % 2 == 0).max(Integer::compareTo)
                .ifPresentOrElse(System.out::println,() -> System.out.println(Integer.MIN_VALUE));
        /*list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 2)
                .max(Map.Entry.comparingByKey())
                .ifPresentOrElse(e -> System.out.println(e.getKey()), () -> System.out.println(Integer.MIN_VALUE));*/
    }
}