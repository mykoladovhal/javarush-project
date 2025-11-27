package ua.javarush.task.task15.task1530;

public class LatteMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("Беремо чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Робимо молоко з пінкою");
    }

    @Override
    void pour() {
        System.out.println("Заливаємо каву");
    }
}
