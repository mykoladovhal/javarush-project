package ua.javarush.task.pro.task11.task1109;

/* 
Об'єкти внутрішніх і вкладених класів
*/

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Створення об'єкта внутрішнього класу");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Створення об'єкта вкладеного класу");
        }
    }
}
