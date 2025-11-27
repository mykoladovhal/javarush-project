package ua.javarush.task.task22.task2206;

import java.util.Date;

/* 
Форматування дати
*/

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format(getFormattedString(), date, date, date, date, date, date));
        //вивід має бути аналогічний наступному:
        //31:10:13 15:59:59
    }

    public static String getFormattedString() {
        return "%1$td:%1$tm:%1$ty %1$tH:%1$tM:%1$tS";
    }
}
