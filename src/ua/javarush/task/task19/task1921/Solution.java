package ua.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        reader.lines()
                .map(s -> s.split("\\s+(?=\\d)", 2))
                .forEach(parts -> {
                    try {
                        String name = parts[0].trim();
                        Date date = sdf.parse(parts[1].trim());
                        PEOPLE.add(new Person(name, date));
                    } catch (ParseException _) {
                    }
                });

        reader.close();
    }
}
