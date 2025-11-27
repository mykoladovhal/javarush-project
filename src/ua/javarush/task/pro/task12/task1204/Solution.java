package ua.javarush.task.pro.task12.task1204;

/* 
Сплата за рахунками
*/

public class Solution {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Поточний баланс : " + balance);
        processPayment(bill);
        System.out.println("Поточний баланс : " + balance);
    }

    public static void processPayment(String bill) {
        //напишіть тут ваш код
        balance -= Integer.parseInt(bill);
    }
}
