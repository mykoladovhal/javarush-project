package ua.javarush.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Аміго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Мене звати . Я зароблятиму $ на місяць.";
        //напишіть тут ваш код
        return String.format("Мене звати %s. Я зароблятиму $%d на місяць.", name, salary);
    }
}
