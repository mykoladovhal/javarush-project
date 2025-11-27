package ua.javarush.task.pro.task12.task1221;

import java.util.ArrayList;

/* 
Узагальнення і студенти
*/

public class Faculty {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакій"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
            }
        }
}
