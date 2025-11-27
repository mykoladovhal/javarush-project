package ua.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
ArrayList і HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишіть тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        return IntStream.range(0, programmingLanguages.size())
                .boxed()
                .collect(Collectors.toMap(
                        index -> index,
                        programmingLanguages::get,
                        (oldValue, newValue) -> oldValue,
                        HashMap::new
                ));
    }

}
