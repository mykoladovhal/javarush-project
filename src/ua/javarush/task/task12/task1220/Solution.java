package ua.javarush.task.task12.task1220;

/* 
Клас Human та інтерфейси CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    //add public interfaces and a public class here - додай public інтерфейси і public клас тут
    public interface CanRun {
        void run();
    }
    public interface CanSwim{
        void swim();
    }

    public abstract class Human implements CanSwim, CanRun{

    }
}
