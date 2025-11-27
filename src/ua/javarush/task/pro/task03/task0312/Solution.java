package ua.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Порівняймо рядки
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine(), line2 = scan.nextLine();
        scan.close();
        if (line.equals(line2)) {
            System.out.println("рядки однакові");
        }
        //напишіть тут ваш код
        else System.out.println("рядки різні");
    }
}
