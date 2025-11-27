package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Підсумовування
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код

        Scanner input = new Scanner(System.in);
        int sum = 0;
        String name;
        while (!(name = input.nextLine()).equals("ENTER")) {
            try {
                sum += Integer.parseInt(name);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.println(sum);
    }
}