package ua.javarush.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Розпакування винятків
*/

public class Solution {

    public static final String FAILED_TO_READ = "Не вдалося прочитати файл.";
    public static final String FAILED_TO_WRITE = "Не вдалося записати у файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (RuntimeException e) {
            if (e.getCause() instanceof FileNotFoundException) System.out.println(FAILED_TO_READ);
            if (e.getCause() instanceof FileSystemException) System.out.println(FAILED_TO_WRITE);
        }
    }
}
