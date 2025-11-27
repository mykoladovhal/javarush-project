package ua.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Склянка наполовину порожня чи наполовину повна?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextBoolean()?(int) Math.ceil(glass):(int) Math.floor(glass));

    }
}