package ua.javarush.task.pro.task17.task1716;

/* 
Дорожній рух
*/

public interface Vehicle {
    default void start() {
        System.out.println("Починаю рух.");
    }

    void move();

    default void stop() {
        System.out.println("Зупиняюся.");
    }
}
