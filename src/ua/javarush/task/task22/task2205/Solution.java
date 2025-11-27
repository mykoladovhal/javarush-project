package ua.javarush.task.task22.task2205;

/* 
МЕНІ подобається курс JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мені", "подобається"));
    }

    public static String getFormattedString() {
        return "%3$2S %4$2s %2$2s %1$2s";
    }
}
