package ua.javarush.task.task11.task1110;

/* 
Не забуваємо інкапсулювати
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {

        private String name;
        private int age;
        private int weight;
        private int speed;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {

        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }
}
