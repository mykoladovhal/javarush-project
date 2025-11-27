package ua.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Висока точність
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble(), y = scan.nextDouble();
        scan.close();
        double precision = 0.000001;
        if (Math.abs(x - y) <= precision) {
            System.out.println("числа рівні");
        }

        //напишіть тут ваш код
        else System.out.println("числа не рівні");
    }
}
