package ua.javarush.task.task24.task2409;

import java.util.List;

/* 
Інтернет-магазин продажу джинсів
*/

public class Solution {

    public static List<Jeans> allJeans = Util.getAllJeans();

    public static void main(String[] args) {
        for (Jeans jeans : allJeans) {
            System.out.println(jeans);
        }
    }

}
