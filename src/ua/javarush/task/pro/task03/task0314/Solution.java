package ua.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Поламана клавіатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        if (scan.nextLine().equalsIgnoreCase(secret)) {
            System.out.println("доступ дозволено");
        }

        //напишіть тут ваш код
        else System.out.println("доступ заборонено");
    }
}
