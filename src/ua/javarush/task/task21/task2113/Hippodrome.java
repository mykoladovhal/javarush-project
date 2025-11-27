package ua.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public static void main(String[] args) {
        ArrayList<Horse> horseArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            horseArrayList.add(new Horse("Horse" + i, 3, 0));
        game = new Hippodrome(horseArrayList);
        game.run();
        game.printWinner();
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void move() {
        horses.forEach(Horse::move);
    }

    void print() {
        horses.forEach(Horse::print);
        for (int i = 0; i < 10; i++) System.out.println();
    }

    public Horse getWinner() {
       return horses.stream().max(Comparator.comparingDouble(Horse::getDistance)).orElse(null);
    }
    public void printWinner() {
        System.out.printf("Winner is %s!", getWinner().getName());
    }


}
