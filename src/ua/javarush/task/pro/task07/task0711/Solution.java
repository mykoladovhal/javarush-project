package ua.javarush.task.pro.task07.task0711;

/* 
Гнучке заповнення масиву
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        //напишіть тут ваш код
        Arrays.fill(array, begin, end, value);
    }
}
