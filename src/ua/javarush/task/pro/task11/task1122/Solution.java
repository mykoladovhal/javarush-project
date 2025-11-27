package ua.javarush.task.pro.task11.task1122;

/* 
Затінення поля класу
*/

public class Solution {
    public static int salary;

    public static void add(int increase) {
       Solution.salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}