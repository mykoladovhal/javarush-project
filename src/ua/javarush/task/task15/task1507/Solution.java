package ua.javarush.task.task15.task1507;

/* 
ООП — Перевантаження
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заповнюємо об'єктами String");
        printMatrix(m, n, (Object) value);
    }

    // Перегрузка для int
    public static void printMatrix(int m, int n, int value) {
        System.out.println("Заповнюємо об'єктами int");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Перегрузка для long
    public static void printMatrix(int m, int n, long value) {
        System.out.println("Заповнюємо об'єктами long");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Перегрузка для double
    public static void printMatrix(int m, int n, double value) {
        System.out.println("Заповнюємо об'єктами double");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Перегрузка для float
    public static void printMatrix(int m, int n, float value) {
        System.out.println("Заповнюємо об'єктами float");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Перегрузка для char
    public static void printMatrix(int m, int n, char value) {
        System.out.println("Заповнюємо об'єктами char");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Перегрузка для boolean
    public static void printMatrix(int m, int n, boolean value) {
        System.out.println("Заповнюємо об'єктами boolean");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Перегрузка для byte
    public static void printMatrix(int m, int n, byte value) {
        System.out.println("Заповнюємо об'єктами byte");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Перегрузка для short
    public static void printMatrix(int m, int n, short value) {
        System.out.println("Заповнюємо об'єктами short");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
