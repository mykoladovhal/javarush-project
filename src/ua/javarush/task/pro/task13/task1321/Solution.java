package ua.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вівторок"));
        System.out.println(getTranslationForDayOfWeek("П'ятниця"));
        System.out.println(getTranslationForDayOfWeek("Нічогонеділя"));
    }

    public static String getTranslationForDayOfWeek(String ua) {
        String en;
        if ("понеділок".equalsIgnoreCase(ua)) {
            en = "Monday";
        } else if ("вівторок".equalsIgnoreCase(ua)) {
            en = "Tuesday";
        } else if ("середа".equalsIgnoreCase(ua)) {
            en = "Wednesday";
        } else if ("четвер".equalsIgnoreCase(ua)) {
            en = "Thursday";
        } else if ("п'ятниця".equalsIgnoreCase(ua)) {
            en = "Friday";
        } else if ("субота".equalsIgnoreCase(ua)) {
            en = "Saturday";
        } else if ("неділя".equalsIgnoreCase(ua)) {
            en = "Sunday";
        } else {
            en = "Неприпустимий день тижня";
        }
        return en;
    }
}
