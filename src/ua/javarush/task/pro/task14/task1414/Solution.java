package ua.javarush.task.pro.task14.task1414;

/* 
Готуємо коктейлі
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s викликано з рядка %d класу %s у файлі %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        //напишіть тут ваш код
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.out.printf(OUTPUT_FORMAT, stackTraceElement.getMethodName(), stackTraceElement.getLineNumber(), stackTraceElement.getClassName(),stackTraceElement.getFileName());
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
