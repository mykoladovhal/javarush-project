package ua.javarush.task.pro.task06.task0607;

/* 
Ласкаво просимо! Але не всіх.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void signIn(String username){
        //напишіть тут ваш код
        if (username.equals("user")) return;
        System.out.println("Ласкаво просимо, " + username);
        System.out.println("Дуже скучили за Вами, " + username);
    }
}
