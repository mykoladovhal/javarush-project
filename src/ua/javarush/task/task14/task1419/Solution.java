package ua.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Нашестя винятків
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }


    private static void initExceptions() {
        // 1. ArithmeticException (деление на 0)
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 2. NumberFormatException (неверный формат числа)
        try {
            Integer.parseInt("abc");
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 3. ArrayIndexOutOfBoundsException (выход за границы массива)
        try {
            int[] arr = new int[1];
            int x = arr[2];
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 4. NullPointerException (вызов метода у null-объекта)
        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 5. ClassCastException (неверное приведение типов)
        try {
            Object obj = new Integer(0);
            String str = (String) obj;
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 6. NegativeArraySizeException (некорректный размер массива)
        try {
            int[] negativeArr = new int[-1];
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 7. IllegalArgumentException (вручную выбрасываем исключение)
        try {
            throw new IllegalArgumentException("Illegal argument");
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 8. FileNotFoundException (файл не найден)
        try {
            new FileInputStream("nonexistentfile.txt");
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 9. IndexOutOfBoundsException для списка
        try {
            List<Integer> list = new ArrayList<>();
            list.get(1);
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 10. UnsupportedOperationException (операция не поддерживается)
        try {
            List<Integer> fixedList = Arrays.asList(1, 2, 3);
            fixedList.add(4);
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
