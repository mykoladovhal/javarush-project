package ua.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static DateFormat formatIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static DateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Іванов Іван", new Date()));  // сьогодні народився   id=0
        allPeople.add(Person.createMale("Петренко Петро", new Date()));  // сьогодні народився   id=1
    }

    public static void main(String[] args) throws ParseException {
        String command = args[0];

        switch (command) {
            case "-c":
                Person person;
                if (args[2].equals("ч")) {
                    person = Person.createMale(args[1], formatIn.parse(args[3]));
                } else {
                    person = Person.createFemale(args[1], formatIn.parse(args[3]));
                }
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;

            case "-r":
                Person personToRead = allPeople.get(Integer.parseInt(args[1]));
                System.out.println(personToRead.getName() + " "
                        + (personToRead.getSex() == Sex.MALE ? "ч" : "ж")
                        + " " + formatOut.format(personToRead.getBirthDate()));
                break;

            case "-u":
                Person personToUpdate = allPeople.get(Integer.parseInt(args[1]));
                personToUpdate.setName(args[2]);
                personToUpdate.setSex(args[3].equals("ч") ? Sex.MALE : Sex.FEMALE);
                personToUpdate.setBirthDate(formatIn.parse(args[4]));
                break;

            case "-d":
                Person personToDelete = allPeople.get(Integer.parseInt(args[1]));
                personToDelete.setName(null);
                personToDelete.setSex(null);
                personToDelete.setBirthDate(null);
                break;

            default:
                throw new IllegalArgumentException("Неверный аргумент: " + command);
        }
    }
}
