package ua.javarush.task.task20.task2026;

/* 
Алгоритми-прямокутники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Має бути 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Має бути 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        int rows = a.length;
        int cols = a[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] == 1) {
                    dfs(a, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(byte[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] == 0)
            return;

        matrix[i][j] = 0; // помечаем как посещённую

        dfs(matrix, i + 1, j); // вниз
        dfs(matrix, i - 1, j); // вверх
        dfs(matrix, i, j + 1); // вправо
        dfs(matrix, i, j - 1); // влево
    }

}
