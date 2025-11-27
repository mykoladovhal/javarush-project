package ua.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        multiArray = new int[scan.nextInt()][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[scan.nextInt()];
        }
    }
}
