package ua.javarush.task.pro.task18.task1803;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new JavaRushMentor("Джон Бобров"),
                new JavaRushMentor("Ріша"),
                new JavaRushMentor("Елеонора Керрі"),
                new JavaRushMentor("Ханс Нудлс"),
                new JavaRushMentor("Кім"),
                new JavaRushMentor("Хуліо Сієста"),
                new JavaRushMentor("Дієго"),
                new JavaRushMentor("Лага Білаабо")
        );

        Collections.sort(mentors, new NameComparator());

        for (JavaRushMentor mentor : mentors) {
            System.out.println(mentor);
        }
    }
}
