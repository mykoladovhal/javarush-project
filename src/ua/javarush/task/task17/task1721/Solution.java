package ua.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Транзакційність
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileFirst = new FileInputStream(reader.readLine());
             FileInputStream fileSecond = new FileInputStream(reader.readLine());
             BufferedReader readerFileFirst = new BufferedReader(new InputStreamReader(fileFirst));
             BufferedReader readerFileSecond = new BufferedReader(new InputStreamReader(fileSecond))) {
            // allLines.addAll(readerFileFirst.lines().toList());
            // forRemoveLines.addAll(readerFileSecond.lines().toList());
            String line;
            while ((line = readerFileFirst.readLine()) != null) {
                allLines.add(line);
            }

            while ((line = readerFileSecond.readLine()) != null) {
                forRemoveLines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            throw new RuntimeException(e);
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
