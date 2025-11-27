package ua.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День тижня твого народження
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1978, Calendar.MAY, 21);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишіть тут ваш код

        return switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY -> "неділя";
            case Calendar.MONDAY -> "понеділок";
            case Calendar.TUESDAY -> "вівторок";
            case Calendar.WEDNESDAY -> "середа";
            case Calendar.THURSDAY -> "четвер";
            case Calendar.FRIDAY -> "п'ятниця";
            case Calendar.SATURDAY -> "субота";
            default -> "Невідомий день";
        };

    }
}
