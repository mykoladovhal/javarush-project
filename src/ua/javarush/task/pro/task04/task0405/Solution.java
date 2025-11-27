package ua.javarush.task.pro.task04.task0405;

/* 
Незаповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int x = 0;
        while (x++ < 10) {
            int y = 0;
            while (y++ < 20) {
                System.out.print(y == 1 || x == 1  || x == 10 || y == 20? "Б":" ");
            }
            System.out.println();
        }

    }
}