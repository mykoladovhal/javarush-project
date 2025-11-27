package ua.javarush.task.pro.task14.task1408;

/* 
Проковтуємо виняток
*/

public class Solution {

    public static String errorMessage = "не пощастило";

    public static void main(String[] args) {
        try {
            generateLuckyNumber();
        } catch (Exception e) {
            System.out.println(errorMessage);
        }
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твоє щасливе число: " + luckyNumber);
    }
}
