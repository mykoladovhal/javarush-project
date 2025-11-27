package ua.javarush.task.pro.task14.task1404;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Помічник викладача-3
*/

public class Solution {

    public static final String PROMPT_STRING = "Введіть номер студента, або exit щоб вийти: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Відповідає ";
    public static final String NOT_EXIST = "Студента з таким номером не існує";
    public static final String INTEGER_REQUIRED = "Потрібно ввести ціле число";

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

            try {
                int studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (NumberFormatException ignore) {
                System.out.println(INTEGER_REQUIRED);
            } catch (ArrayIndexOutOfBoundsException ignore) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
