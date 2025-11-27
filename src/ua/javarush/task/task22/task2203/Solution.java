package ua.javarush.task.task22.task2203;

/* 
Між табуляціями
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();

        int first = string.indexOf('\t');
        int second = string.indexOf('\t', first + 1);

        if (first == -1 || second == -1) throw new TooShortStringException();

        return string.substring(first + 1, second);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - найкращий сервіс \tвивчити Java\t."));
    }
}
