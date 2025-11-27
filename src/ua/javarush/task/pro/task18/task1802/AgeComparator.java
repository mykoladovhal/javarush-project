package ua.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортування за віком
*/

public class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    }
    //напишіть тут ваш код
}
