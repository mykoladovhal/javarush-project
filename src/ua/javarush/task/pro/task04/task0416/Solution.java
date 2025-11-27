package ua.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        scan.close();
        System.out.println(Math.round((double) a / b * 100.0) / 100.0);

    }
}