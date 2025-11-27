package ua.javarush.task.pro.task13.task1319;

/* 
Місяці в порах року
*/

import java.util.Arrays;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишіть тут ваш код
    public static Month[] getWinterMonths() {
        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }
    public static Month[] getSpringMonths() {
        return new Month[]{MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMonths() {
        return new Month[]{JUNE, JULY, AUGUST};
    }

    public static Month[] getAutumnMonths() {
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }

}
