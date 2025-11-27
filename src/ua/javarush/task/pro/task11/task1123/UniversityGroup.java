package ua.javarush.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.List;

/* 
Відчуй себе деканом
*/

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергій Фрединський");
        students.add("Віталій Правдивий");
        students.add("Максим Козименко");
        students.add("Наталія Андрющенко");
        students.add("Іра Величенко");
        students.add("Микола Соболєв");
        students.add("Сніжана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        students.removeIf(s -> s.equals(excludedStudent));
       /* for (String student : students) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
            }
        }*/
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Віталій Правдивий");
        universityGroup.students.forEach(System.out::println);
    }
}