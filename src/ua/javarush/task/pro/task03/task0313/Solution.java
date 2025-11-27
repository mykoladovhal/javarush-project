package ua.javarush.task.pro.task03.task0313;

public class Solution {
    public static String string1 = "Аміго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "посилання на рядки однакові";
        String different = "посилання на рядки різні";
        //напишіть тут ваш код

        String result;
        System.out.println((string1 == string2) ? same : different);
        System.out.println((string2 == string3) ? same : different);
        System.out.println((string1 == string3) ? same : different);

        //System.out.println(same);

        //System.out.println(different);
    }
}
