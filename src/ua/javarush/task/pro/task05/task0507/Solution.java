package ua.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        array = new int[scan.nextInt()];
        for (int i = 0; i < array.length; i++) {array[i] = scan.nextInt();}
        scan.close();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {if (array[i] > max) max = array[i];}
        System.out.println(max);
    }
}
