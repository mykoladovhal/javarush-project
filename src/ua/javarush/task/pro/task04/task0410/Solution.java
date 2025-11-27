package ua.javarush.task.pro.task04.task0410;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/* 
Друге мінімальне число серед уведених
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        TreeSet<Integer> set = new TreeSet<>(Comparator.naturalOrder());
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                set.add(scan.nextInt());
            } catch (Exception ignored) {
                break;
            }
        }
        scan.close();
        System.out.println(set.higher(set.first()));


    }
}