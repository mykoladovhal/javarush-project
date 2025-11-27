package ua.javarush.task.pro.task18.task1802;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Іваненко", 22),
                new Student("Петренко", 18),
                new Student("Сидоренко", 19)
        );

        Collections.sort(students, new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
