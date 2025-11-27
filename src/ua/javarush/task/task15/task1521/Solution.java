package ua.javarush.task.task15.task1521;

import java.math.BigDecimal;

/* 
ООП. Перевантаження
*/

public class Solution {
    public static void main(String[] args) {
        // Блок 2.
        // Виклик для Object
        new Tree().info((Object) new Integer("4"));
        new Tree().info((Object) new Short("4"));
        new Tree().info((Object) new BigDecimal("4"));

        // Блок 3.
        // Виклик для Number
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        // Блок 4.
        // Виклик для String
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
