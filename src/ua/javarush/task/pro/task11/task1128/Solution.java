package ua.javarush.task.pro.task11.task1128;

/* 
Текстові цифри
*/

public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "нуль";
                break;
            case '1':
                result = "один";
                break;
            case '2':
                result = "два";
                break;
            case '3':
                result = "три";
                break;
            case '4':
                result = "чотири";
                break;
            case '5':
                result = "п'ять";
                break;
            case '6':
                result = "шість";
                break;
            case '7':
                result = "сім";
                break;
            case '8':
                result = "вісім";
                break;
            case '9':
                result = "дев'ять";
                break;
        }
        return result;
    }
}
