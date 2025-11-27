package ua.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Читання і перетворення рядків
*/

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String three = scanner.nextLine();
        System.out.println(three);
        System.out.println(two.toUpperCase());
        System.out.println(one.toLowerCase());
    }
}
