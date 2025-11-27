package ua.javarush.task.pro.task04.task0407;

/* 
Сума чисел, не кратних 3
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int count = 101, result = 0;
        while (count-- > 0) {
            if (count % 3 == 0) continue;
            result += count;
        }
        System.out.println(result);
    }
}