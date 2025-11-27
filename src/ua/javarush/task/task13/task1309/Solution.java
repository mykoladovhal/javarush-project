package ua.javarush.task.task13.task1309;

/* 
Все, що рухається
*/

public class Solution {
    public interface CanMove {
        Double speed();
    }

    public interface CanFly extends CanMove {
        Double speed (CanFly canFly);
    }

    public static void main(String[] args) throws Exception {
    }
}