package ua.javarush.task.task13.task1324;

import java.awt.*;

/* 
Один метод у класі
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public abstract static class Fox implements Animal{
        public String getName() {
            return "Fox";
        }
    }
}
