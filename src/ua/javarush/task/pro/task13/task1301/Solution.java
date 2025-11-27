package ua.javarush.task.pro.task13.task1301;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* 
Повертаємо своє
*/

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "роки", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишіть тут ваш код
        return new HashSet<>(List.of(strings));
    }
}
