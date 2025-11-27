package ua.javarush.task.pro.task09.task0908;

import java.util.Arrays;
import java.util.regex.Pattern;

/*
Двійково-шістнадцятковий конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює шістнадцятковому числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
         System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює двійковому числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) return "";

        // Дополнение строки до кратности 4
        if (binaryNumber.length() % 4 != 0) {
            StringBuilder paddedString = new StringBuilder();
            paddedString.append("0".repeat(4 - binaryNumber.length() % 4));
            paddedString.append(binaryNumber);
            binaryNumber = paddedString.toString();
        }

        // Преобразование 4-битных блоков в шестнадцатеричное число
        StringBuilder hexNumber = new StringBuilder();
        for (String chunk : binaryNumber.split("(?<=\\G.{4})")) { // Разбиваем строку на блоки по 4 символа
            int decimalValue = binaryToDecimal(chunk); // Преобразуем двоичный блок в десятичное число
            hexNumber.append(decimalToHex(decimalValue)); // Конвертируем в шестнадцатеричное
        }

        return hexNumber.toString();
    }

    private static int binaryToDecimal(String binary) {
        int decimalValue = 0;
        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(binary.length() - 1 - i); // Читаем биты справа налево
            if (bit == '1') {
                decimalValue += (int) Math.pow(2, i); // Добавляем 2^i, если бит равен 1
            } else if (bit != '0') {
                throw new IllegalArgumentException("Invalid binary character: " + bit);
            }
        }
        return decimalValue;
    }

    private static char decimalToHex(int decimal) {
        if (decimal >= 0 && decimal <= 9) {
            return (char) ('0' + decimal); // Преобразование чисел от 0 до 9
        } else if (decimal >= 10 && decimal <= 15) {
            return (char) ('a' + (decimal - 10)); // Преобразование чисел от 10 до 15 (a-f)
        } else {
            throw new IllegalArgumentException("Decimal value out of range: " + decimal);
        }
    }

    public static String toBinary(String hexNumber) {


        StringBuilder binaryNumber = new StringBuilder();
        if (hexNumber == null) return "";
        if (!hexNumber.matches("^[0-9a-f]+$")) return "";
        for (char hexChar : hexNumber.toCharArray()) {
            int decimalValue = hexToDecimal(hexChar); // Преобразуем шестнадцатеричный символ в десятичное число
            binaryNumber.append(decimalToBinary(decimalValue)); // Преобразуем десятичное число в двоичное вручную
        }

        return binaryNumber.toString();
    }

    private static int hexToDecimal(char hexChar) {
        if (hexChar >= '0' && hexChar <= '9') {
            return hexChar - '0'; // Преобразование символов '0'-'9'
        } else if (hexChar >= 'a' && hexChar <= 'f') {
            return hexChar - 'a' + 10; // Преобразование символов 'a'-'f'
        } else if (hexChar >= 'A' && hexChar <= 'F') {
            return hexChar - 'A' + 10; // Преобразование символов 'A'-'F'
        } else {
            throw new IllegalArgumentException("Invalid hex character: " + hexChar);
        }
    }

    private static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        for (int i = 3; i >= 0; i--) { // Шестнадцатеричный символ всегда соответствует 4 битам
            int bit = (decimal >> i) & 1; // Получаем значение i-го бита
            binary.append(bit);
        }
        return binary.toString();
    }
}
