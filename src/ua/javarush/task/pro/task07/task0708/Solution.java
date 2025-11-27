package ua.javarush.task.pro.task07.task0708;

/* 
Правильні типи
*/

public class Solution {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
        //напишіть тут ваш код
        a =(byte) value;
        b = (short) value;
        c =(int) value;
        d = value;

    }
}
