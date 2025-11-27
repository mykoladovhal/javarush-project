package ua.javarush.task.pro.task08.task0804;

/* 
Randomizer
*/

import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        //напишіть тут ваш код
      return   (int)  (Math.random() * 100);

       // return  new Random().nextInt(100);
    }
}
