package ua.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        String[] line = {"user", "loser", "coder", "proger"};

        while ((key = reader.readLine()) != null && Arrays.asList(line).contains(key)) {
            if (key.equals(line[0])) person = new Person.User();
            if (key.equals(line[1])) person = new Person.Loser();
            if (key.equals(line[2])) person = new Person.Coder();
            if (key.equals(line[3])) person = new Person.Proger();
            doWork(person);
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) ((Person.User) person).live();
        if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
