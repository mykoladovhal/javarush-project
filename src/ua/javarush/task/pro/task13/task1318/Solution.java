package ua.javarush.task.pro.task13.task1318;

/* 
Наступний місяць, будь ласка
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        //напишіть тут ваш код
      return  Month.values()[(month.ordinal() + 1) % 12];
    }
}
