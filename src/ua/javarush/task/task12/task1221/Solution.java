package ua.javarush.task.task12.task1221;

/* 
Всі ми трохи коти.
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пухнастик";
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Я - кіт";
        }
    }
}
