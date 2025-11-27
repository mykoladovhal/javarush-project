package ua.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Стек в домашніх умовах
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        //напишіть тут ваш код
        storage.add(0, s);
    }

    public String pop() {
        //напишіть тут ваш код
        return storage.remove(0);
    }

    public String peek() {
        //напишіть тут ваш код
        return storage.get(0);
    }

    public boolean empty() {
        //напишіть тут ваш код
        return storage.isEmpty();
    }

    public int search(String s) {
        //напишіть тут ваш код
        return storage.indexOf(s);
    }
}
