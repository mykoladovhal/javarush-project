package ua.javarush.task.pro.task15.task1514;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Усе відносне
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишіть тут ваш код
        Path first = Path.of(str1), second = Path.of(str2);
        try {
            System.out.println(first.relativize(second));
        } catch (Exception e) {
            System.out.println(second.relativize(first));
        }
    }
}

