package ua.javarush.task.pro.task13.task1320;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        return switch (monthIndex) {
            case 1 -> "Січень";
            case 2 -> "Лютий";
            case 3 -> "Березень";
            case 4 -> "Квітень";
            case 5 -> "Травень";
            case 6 -> "Червень";
            case 7 -> "Липень";
            case 8 -> "Серпень";
            case 9 -> "Вересень";
            case 10 -> "Жовтень";
            case 11 -> "Листопад";
            case 12 -> "Грудень";
            default -> "Неприпустимий місяць";
        };
    }
}
