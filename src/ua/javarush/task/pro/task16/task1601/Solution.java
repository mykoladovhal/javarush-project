package ua.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Аби не в понеділок:)
*/

public class Solution {

    static Date birthDate = new Date(78, 4, 22);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        switch (date.getDay()) {
            case 0 -> { return "неділя"; }
            case 1 -> { return "понеділок"; }
            case 2 -> { return "вівторок"; }
            case 3 -> { return "середа"; }
            case 4 -> { return "четвер"; }
            case 5 -> { return "п'ятниця"; }
            case 6 -> { return "субота"; }
            default -> { return "Невідомий день"; }
        }
    }
}
