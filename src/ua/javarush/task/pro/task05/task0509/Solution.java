package ua.javarush.task.pro.task05.task0509;

/* 
Таблиця множення
*/

import java.util.Arrays;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишіть тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                MULTIPLICATION_TABLE[i- 1][j - 1] = i * j;
            }
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i- 1][j - 1] + " ");
            }
            System.out.println();
        }
    }
}
