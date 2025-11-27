package ua.javarush.task.pro.task02.task0202;

/* 
Повнометражна картина
*/

public class Solution {

    public static void main(String[] args) {
        int centimeters = 243;

        int meters = (centimeters - centimeters % 100) / 100; //напишіть тут ваш код

        System.out.println(meters);
    }
}