package ua.javarush.task.pro.task03.task0310;

import java.util.Scanner;

/* 
Крізь терни…
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
      //  String result = number < 5 ? "число менше за 5" : number > 5 ? "число більше за 5" : "число дорівнює 5";
        if (number < 5) {
            System.out.println("число менше за 5");
        } else if (number == 5) {
            System.out.println("число дорівнює 5");
        }else System.out.println("число більше за 5");

    }
}
