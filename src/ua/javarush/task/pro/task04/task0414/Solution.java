package ua.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошого забагато не буває
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int count = scan.nextInt();
        scan.close();
        do {
            System.out.println(name);
            count--;
        }
        while (count > 0 && count < 4);
    }
}