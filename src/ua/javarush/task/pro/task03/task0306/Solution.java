package ua.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Трикутник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "трикутник існує";
    private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
        System.out.println((a + b > c) && (a + c > b) && (b + c > a) ? TRIANGLE_EXISTS : TRIANGLE_NOT_EXISTS);
    }
}
