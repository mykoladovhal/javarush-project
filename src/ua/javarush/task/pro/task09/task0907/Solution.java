package ua.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шістнадцятковий конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює шістнадцятковому числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює десятковому числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишіть тут ваш код
        if (decimalNumber <= 0) {
            return ""; // Обробка від'ємних чисел
        }


        StringBuilder hexString = new StringBuilder(); // Рядкове подання шістнадцяткового числа

        while (decimalNumber != 0) {
            int remainder = decimalNumber % 16; // Знаходимо остачу від ділення на 16
            hexString.insert(0, HEX.charAt(remainder)); // Додаємо символ на початок
            decimalNumber = decimalNumber / 16; // Ділимо число на 16
        }

        return hexString.toString();
    }

    public static int toDecimal(String hexNumber) {
        //напишіть тут ваш код
        if (hexNumber == null) return 0;
        int decimalValue = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            decimalValue = decimalValue * 16 + HEX.indexOf( hexNumber.charAt(i)); // Увеличиваем десятичное значение
        }
        return decimalValue;
    }
}
