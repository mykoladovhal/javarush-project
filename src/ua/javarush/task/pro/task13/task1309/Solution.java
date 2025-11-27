package ua.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успішність студентів
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишіть тут ваш код
        for (int i = 0; i < 5; i++) {
            grades.put("Student" + i, (double) i);
        }
    }
}
