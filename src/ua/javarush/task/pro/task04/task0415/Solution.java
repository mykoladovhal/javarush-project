package ua.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площа круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        scan.close();
        int area = (int) (3.14 * radius * radius);
        System.out.println(area);
    }
}