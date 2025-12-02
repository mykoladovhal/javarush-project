package ua.javarush.task.task25.task2511;

import java.util.TimerTask;

/* 
Озброюємось до зубів!
*/

public class Solution extends TimerTask {
    protected TimerTask original; // Оригинальная задача, которую оборачиваем
    protected final Thread.UncaughtExceptionHandler handler; // Обработчик ошибок

    public Solution(TimerTask original) {
        if (original == null) {
            throw new NullPointerException();
        }
        this.original = original;

        // Создаём обработчик необработанных исключений
        this.handler = (t, e) -> {
            // Заменяем название потока в сообщении ошибки на звездочки
            // 1. t.getName().replaceAll(".", "*") - заменяет все символы названия на *
            // 2. e.getMessage().replaceAll(...) - ищет название потока в сообщении и заменяет его
            // Пример: "Blah Thread-1 blah" → "Blah ******** blah"
            System.out.println(e.getMessage().replaceAll(t.getName(), t.getName().replaceAll(".", "*")));
        };
    }

    public void run() {
        try {
            // Запускаем оригинальную задачу
            original.run();
        } catch (Throwable cause) {
            // Если произошла ошибка, обрабатываем её через наш handler
            Thread currentThread = Thread.currentThread();
            // Создаем новое исключение с сообщением, содержащим название потока
            handler.uncaughtException(currentThread, new Exception("Blah " + currentThread.getName() + " blah-blah-blah", cause));
        }
    }

    public long scheduledExecutionTime() {
        return original.scheduledExecutionTime();
    }

    public boolean cancel() {
        return original.cancel();
    }

    public static void main(String[] args) {
        // Создаём оригинальную задачу, которая бросит исключение
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                throw new RuntimeException("Что-то пошло не так!");
            }
        };

        // Оборачиваем её в наш Solution
        Solution solution = new Solution(task);

        // Запускаем
        solution.run();
    }
}

