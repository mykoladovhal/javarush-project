package ua.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        if (n % 2 == 0) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
