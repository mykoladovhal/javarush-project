package ua.javarush.task.task22.task2202;

/* 
Знайти підрядок
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - найкращий сервіс для вивчення Java."));
    }

    public static String getPartOfString(String string) {
        try {
            Matcher m = Pattern.compile("(?:\\S+\\s+){1}((?:\\S+\\s+){3}\\S+)").matcher(string);
            if (m.find()) return m.group(1);
            else throw new TooShortStringException(); // шаблон не совпал
        } catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
