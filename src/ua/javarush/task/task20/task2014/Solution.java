package ua.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) {
        System.out.println(new Solution(4));
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out.ser"));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.ser"))) {
            Solution savedObject = new Solution(3);
            out.writeObject(savedObject);
            Solution loadObject = (Solution) in.readObject();
            System.out.println(loadObject);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
