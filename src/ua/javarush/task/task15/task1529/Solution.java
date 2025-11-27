package ua.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Освоювання статичного блоку
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //напишіть тут ваш код
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //напишіть тут ваш код

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String parameter = reader.readLine();
            if (parameter.equals("helicopter")) result = new Helicopter();
            if (parameter.equals("plane")) result = new Plane(12);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
