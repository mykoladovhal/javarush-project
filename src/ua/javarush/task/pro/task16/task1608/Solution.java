package ua.javarush.task.pro.task16.task1608;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/* 
Просто день тижня
*/

public class Solution {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        //напишіть тут ваш код
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("uk"));
    }
}
