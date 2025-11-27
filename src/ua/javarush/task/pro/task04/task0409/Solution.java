package ua.javarush.task.pro.task04.task0409;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Мінімум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            try {
                list.add(scan.nextInt());
            } catch (Exception ignored) {
                break;
            }
        }
        list.stream()
                .min(Integer::compareTo)
                .ifPresentOrElse(System.out::println, ()-> System.out.println(Integer.MAX_VALUE));
    }
}