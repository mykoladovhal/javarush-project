package ua.javarush.task.task11.task1109;

/* 
Як кішка з собакою
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Василь", 5);
        Dog dog = new Dog("Сірко", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    private String name;
    private int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}



