package ua.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Читання чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a + b + c) / 3);
    }
}
