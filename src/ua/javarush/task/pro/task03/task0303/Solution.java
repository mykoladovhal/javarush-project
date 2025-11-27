package ua.javarush.task.pro.task03.task0303;

import java.util.Scanner;

/* 
Школа чи інститут
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age >= 6)
                System.out.println("треба ходити до школи");
        } else
            System.out.println("час до інституту");
    }
}
