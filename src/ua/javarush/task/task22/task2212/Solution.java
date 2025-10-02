package ua.javarush.task.task22.task2212;

/* 
Перевірка номера телефону
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) return false;
        return telNumber.matches("^(?:\\+(?=(?:\\D*\\d){12}\\D*$)(?:\\d+|\\d*\\(\\d{3}\\)\\d+)|(?=(?:\\D*\\d){10}\\D*$)(?:\\d+|\\d*\\(\\d{3}\\)\\d+))$");

    }
    public static void main(String[] args) {

    }
}
