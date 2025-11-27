package ua.javarush.task.pro.task08.task0814;

/* 
Прапори
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        //напишіть тут ваш код
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        //напишіть тут ваш код
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишіть тут ваш код
        return (number & (1 << flagPos)) == (1 << flagPos);

    }
}
