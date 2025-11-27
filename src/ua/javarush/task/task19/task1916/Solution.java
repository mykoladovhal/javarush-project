package ua.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Відстежуємо зміни
*/

/*
public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine(), file2 = reader.readLine();
        reader.close();
        BufferedReader readerFile1 = new BufferedReader(new FileReader(file1));
        BufferedReader readerFile2 = new BufferedReader(new FileReader(file2));
        List<String> listFile1 = readerFile1.lines().toList(), listFile2 = readerFile2.lines().toList();

        int i = 0; // для listFile1
        int j = 0; // для listFile2

        while (i < listFile1.size() && j < listFile2.size()) {
            String line1 = listFile1.get(i);
            String line2 = listFile2.get(j);

            if (line1.equals(line2)) {
                lines.add(new LineItem(Type.SAME, line1));
                i++;
                j++;
            } else if ((j + 1 < listFile2.size()) && line1.equals(listFile2.get(j + 1))) {
                lines.add(new LineItem(Type.ADDED, listFile2.get(j)));

                j++;
            } else if ((i + 1 < listFile1.size()) && listFile1.get(i + 1).equals(line2)) {
                lines.add(new LineItem(Type.REMOVED, listFile1.get(i)));
                i++;
            } else {
                lines.add(new LineItem(Type.REMOVED, listFile1.get(i)));
                lines.add(new LineItem(Type.ADDED, listFile2.get(j)));
                i++;
                j++;
            }
        }

    }

    public static enum Type {
        ADDED,        // доданий новий рядок
        REMOVED,      // видалений рядок
        SAME          // без змін
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
*/
public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        List<String> listFile1 = readFileLines(file1);
        List<String> listFile2 = readFileLines(file2);

        int i = 0; // для listFile1
        int j = 0; // для listFile2

        while (i < listFile1.size() && j < listFile2.size()) {
            String line1 = listFile1.get(i);
            String line2 = listFile2.get(j);

            if (line1.equals(line2)) {
                lines.add(new LineItem(Type.SAME, line1));
                i++;
                j++;
            } else if ((j + 1 < listFile2.size()) && line1.equals(listFile2.get(j + 1))) {
                lines.add(new LineItem(Type.ADDED, listFile2.get(j)));
                j++;
            } else if ((i + 1 < listFile1.size()) && listFile1.get(i + 1).equals(line2)) {
                lines.add(new LineItem(Type.REMOVED, listFile1.get(i)));
                i++;
            } else {
                lines.add(new LineItem(Type.REMOVED, listFile1.get(i)));
                lines.add(new LineItem(Type.ADDED, listFile2.get(j)));
                i++;
                j++;
            }
        }

        while (i < listFile1.size()) {
            lines.add(new LineItem(Type.REMOVED, listFile1.get(i++)));
        }

        while (j < listFile2.size()) {
            lines.add(new LineItem(Type.ADDED, listFile2.get(j++)));
        }

        // Вывод результатов (опционально)
        for (LineItem item : lines) {
            System.out.println(item.type + " " + item.line);
        }
    }

    private static List<String> readFileLines(String filename) throws IOException {
        List<String> lines = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        return lines;
    }

    public static enum Type {
        ADDED,        // добавлен новый строка
        REMOVED,      // удаленная строка
        SAME          // без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}