package ua.javarush.task.pro.task17.task1707;

public class Dog extends Pet {
    public static final String DOG = "Я люблю людей.";

    //напишіть тут ваш код

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(DOG);
    }
}
