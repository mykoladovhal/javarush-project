package ua.javarush.task.task13.task1315;

/* 
Том, Джері та Спайк
*/


public class Solution {
    public static void main(String[] args) {

    }

    // може рухатись
    public interface Movable {
        void move();
    }

    // може бути з'їденим
    public interface Edible {
        void beEaten();
    }

    // може когось з'їсти
    public interface Eat {
        void eat();
    }

    public static class Dog implements Movable, Eat{
        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }
    public static class Cat implements Movable, Eat, Edible {
        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }
    public static class Mouse implements Movable, Edible{
        @Override
        public void beEaten() {

        }

        @Override
        public void move() {

        }
    }
}