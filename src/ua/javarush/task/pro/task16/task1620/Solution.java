package ua.javarush.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* 
Ще один простий шаблон
*/

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //напишіть тут ваш код
        //4 9.3.19 06:03:07.319180500 Europe/Kiev
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV", Locale.ENGLISH);
        System.out.println(zonedDateTime.format(formatter));

    }
}
