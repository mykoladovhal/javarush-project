package ua.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатні чверті
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();
        if (x > 0 && y > 0) {
            System.out.println(1);
        }
        if (x < 0 && y > 0) {
            System.out.println(2);
        }
        if (x < 0 && y < 0) {
            System.out.println(3);
        }
        if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }

}
