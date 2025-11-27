package ua.javarush.task.task13.task1327;

import java.util.ArrayList;
import java.util.List;

/* 
Ріпка
*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Ріпка", "Ріпку"));
        plot.add(new Person("Дід", "Діда"));
        plot.add(new Person("Бабця", "Бабцю"));
        plot.add(new Person("Онучка", "Онучку"));
        RepkaStory.tell(plot);
    }
}
