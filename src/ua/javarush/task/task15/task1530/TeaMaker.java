package ua.javarush.task.task15.task1530;

public class TeaMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("Беремо чашку для чаю");
    }

    @Override
    void putIngredient() {
        System.out.println("Насипаємо чай");
    }

    @Override
    void pour() {
        System.out.println("Заливаємо окропом");
    }
}
