package ua.javarush.task.pro.task12.task1208;

/* 
Порівняння символів
*/

public class Solution {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('и', 'и');
    }

    public static void compare(Character first, Character second) {
        if (first.equals(second)) {
            System.out.println("однакові");
        } else if (first > second) {
            System.out.println("більше");
        } else if (first < second) {
            System.out.println("менше");
        } else {
            System.out.println("Хіба таке може бути???");
        }
    }
}
