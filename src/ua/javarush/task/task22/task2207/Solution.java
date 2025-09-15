package ua.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/*
Обернені слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> words = Files.readAllLines(Paths.get(reader.readLine()))
                    .stream()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .collect(Collectors.toList());

            for (int i = 0; i < words.size(); i++) {
                String first = words.get(i);
                for (int j = i + 1; j < words.size(); j++) {
                    String second = words.get(j);
                    if (first.contentEquals(new StringBuilder(second).reverse())){
                        Pair pair = new Pair();
                        pair.first = first;
                        pair.second = second;
                        result.add(pair);
                        words.remove(j);
                        break;
                    }
                }
            }
            result.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
