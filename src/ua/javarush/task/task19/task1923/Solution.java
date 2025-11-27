package ua.javarush.task.task19.task1923;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

/* 
Слова з цифрами
*/

public class Solution {
    public static void main(String[] args) {
        //  args = new String[]{"test", "test1.txt"};
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter fileWriter = new FileWriter(args[1])) {
            reader.lines()
                    .flatMap(line -> Arrays.stream(line.split(" "))) // split по одному пробелу!
                    .filter(word -> word.matches(".*[0-9].*")) // как в эталоне
                    .forEach(word -> {
                        try {
                            fileWriter.write(word + " "); // обязательно пробел после каждого слова
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    });
        } catch (IOException ignore) {
        }
    }
}
