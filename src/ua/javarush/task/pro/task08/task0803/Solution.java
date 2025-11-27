package ua.javarush.task.pro.task08.task0803;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/* 
Мінімальний елемент масиву
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишіть тут ваш код

        int min = Integer.MAX_VALUE;
        for (int anInt : ints) {
            min = Math.min(min, anInt);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишіть тут ваш код
        int[] result = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) result[i] = scanner.nextInt();
        scanner.close();
        return result;
    }
}
