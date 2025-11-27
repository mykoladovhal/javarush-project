package ua.javarush.task.task12.task1223;

/* 
І знову Пухнастик...
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пухнастик");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public final String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            super.setName("");
        }
    }
}
