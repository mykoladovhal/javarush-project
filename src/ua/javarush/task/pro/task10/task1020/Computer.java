package ua.javarush.task.pro.task10.task1020;

public class Computer {
    private SystemUnit systemUnit;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer() {
        this.systemUnit = new SystemUnit();
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
    }
}
