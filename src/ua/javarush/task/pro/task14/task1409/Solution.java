package ua.javarush.task.pro.task14.task1409;

/* 
Пропускаємо крізь себе
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не пощастило");
        }
        System.out.println("твоє щасливе число: " + luckyNumber);
    }
}
