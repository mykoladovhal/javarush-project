package ua.javarush.task.pro.task12.task1207;

/* 
Яке число менше
*/

public class Solution {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("Перше число менше за друге");
        } else {
            System.out.println("Перше число більше за друге або дорівнює йому");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second;
    }
}
