package ua.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двійковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишіть тут ваш код
        if (decimalNumber == 0) return "";
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.append(remainder);
            decimalNumber /= 2;
        }
        return binary.reverse().toString();
    }

    public static int toDecimal(String binaryNumber) {
        //напишіть тут ваш код
        if (binaryNumber == null || binaryNumber.isEmpty()) return 0;
        int decimal = 0;
        int power = 0;

        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            char bit = binaryNumber.charAt(i);
            if (bit == '1') {
                decimal += (int) Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}
