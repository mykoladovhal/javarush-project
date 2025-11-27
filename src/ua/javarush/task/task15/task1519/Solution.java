package ua.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Різні методи для різних типів
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = reader.readLine()).equals("exit")) {
            try {
                if (line.contains(".")) print(Double.parseDouble(line));
                else if (Integer.parseInt(line) > 0 && Integer.parseInt(line) < 128) print(Short.parseShort(line));
                else print(Integer.parseInt(line));
            } catch (NumberFormatException e) {
                print(line);
            }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Це тип Double, значення " + value);
    }

    public static void print(String value) {
        System.out.println("Це тип String, значення " + value);
    }

    public static void print(short value) {
        System.out.println("Це тип short, значення " + value);
    }

    public static void print(Integer value) {
        System.out.println("Це тип Integer, значення " + value);
    }
}
