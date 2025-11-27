package ua.javarush.task.pro.task14.task1402;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Помічник викладача
*/

public class Solution {

    public static final String PROMPT_STRING = "Введіть номер студента, або exit щоб вийти: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Відповідає ";
    public static final String NOT_EXIST = "Студента з таким номером не існує";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур М'ясний"
            , "Пенелопа Сиволап"
            , "Орест Злобін"
            , "Ірида Продуваленко"
            , "Гектор Гадюкін"
            , "Електра Чемоданко"
            , "Гвідон Недумко"
            , "Роксана Борисенко"
            , "Юліан Мумбриченко"
            , "Зігфрід Горемикін");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }

            int studentId = Integer.parseInt(input);
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (Exception ignore) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
