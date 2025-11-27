package ua.javarush.task.pro.task09.task0905;

import java.util.Map;
import java.util.regex.Pattern;

/* 
Вісімковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишіть тут ваш код
        int octal = 0;
        int placeValue = 1;

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8; // Залишок від ділення на 8
            octal += remainder * placeValue;  // Формування вісімкового числа
            decimalNumber /= 8;               // Цілочисельне ділення
            placeValue *= 10;                 // Перехід до наступного розряду
        }

        return octal;
    }

    public static int toDecimal(int octalNumber) {
        //напишіть тут ваш код

        int decimal = 0;
        int placeValue = 1;
        while (octalNumber > 0) {
            int remainder = octalNumber % 10;
            decimal += remainder * placeValue;
            octalNumber /= 10;
            placeValue *= 8;
        }
        return decimal;
    }
}
