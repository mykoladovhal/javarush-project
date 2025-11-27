package ua.javarush.task.pro.task10.task1015;

/* 
Їжачок і яблуко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблуко з'їли!");
    }

    public static void main(String[] args) {
        //напишіть тут ваш код
        Apple apple = new Apple();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}
