package ua.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Усі люблять Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любить мене.";
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        scan.close();
        int counter = 0;
        while (counter < 10) {
            System.out.println(word + text);
            counter++;
        }

    }
}
