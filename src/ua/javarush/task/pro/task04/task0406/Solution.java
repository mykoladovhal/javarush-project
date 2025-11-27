package ua.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показуємо, що отримуємо
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner input = new Scanner(System.in);
        String name;
        while (true) {
            if ((name = input.nextLine()).equals("enough")) break;
            System.out.println(name);
        }
    }
}