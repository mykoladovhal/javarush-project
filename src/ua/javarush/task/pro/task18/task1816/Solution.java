package ua.javarush.task.pro.task18.task1816;

import java.util.stream.Stream;

/* 
Перетворення даних-2
*/

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "хвилюйтеся", "якщо", "щось", "не", "працює.", "Коли", "б", "усе", "працювало", "вас", "би", "звільнили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        //напишіть тут ваш код
        return strings.map(String::toUpperCase);

    }
}
