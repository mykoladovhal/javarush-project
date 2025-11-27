package ua.javarush.task.task15.task1505;

/* 
ООП — виправ помилки в успадкування
*/

public class Solution {
    public interface HasWeight {
        int getWeight();
    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasWeight, HasHeight {

        @Override
        public int getHeight() {
            return 10;
        }

        @Override
        public int getWeight() {
            return 20;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getHeight());
        System.out.println(human.getWeight());
    }
}