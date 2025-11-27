package ua.javarush.task.pro.task05.task0502;

/* 
Парні та непарні комірки масиву
*/

public class Solution {
    public static final String ODD = "Непарний";
    public static final String EVEN = "Парний";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        //напишіть тут ваш код
        for (int i = 0; i < strings.length; i++) {
            strings[i] = i % 2 != 0 ? ODD : EVEN;
        }

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}
