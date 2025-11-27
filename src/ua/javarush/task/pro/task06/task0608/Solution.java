package ua.javarush.task.pro.task06.task0608;

/* 
Кубічний калькулятор
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(cube(scanner.nextLong()));
        scanner.close();
    }

    //напишіть тут ваш код
    public static long cube (long a) {
        return a * a * a;
    }
}
