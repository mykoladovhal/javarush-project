package ua.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл чи директорія
*/

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) {
        //напишіть тут ваш код
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Path line = Path.of(scanner.nextLine());
            if (Files.isRegularFile(line)) System.out.printf("%s%s\n", line, THIS_IS_FILE);
            else if (Files.isDirectory(line)) System.out.printf("%s%s\n", line,THIS_IS_DIR);
            else return;
        }
    }
}

