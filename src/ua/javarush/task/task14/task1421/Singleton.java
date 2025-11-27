package ua.javarush.task.task14.task1421;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) { // первая проверка без синхронизации
            synchronized (Singleton.class) {
                if (instance == null) { // вторая проверка внутри синхронизированного блока
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
