package ua.javarush.task.task25.task2510;

/* 
Поживемо — побачимо
*/

public class Solution extends Thread {

    public Solution() {
        // Устанавливаем обработчик необработанных исключений для этого потока
        this.setUncaughtExceptionHandler(handler);
    }

    // Создаём обработчик необработанных исключений
    // t - поток, в котором произошло исключение
    // e - само исключение (Throwable)
    Thread.UncaughtExceptionHandler handler = (t, e) -> {
        // Проверяем тип исключения и выводим соответствующее сообщение
        
        // Error - критические ошибки JVM (OutOfMemoryError, StackOverflowError и т.д.)
        if (e instanceof Error) {
            System.out.println("Не можна працювати далі");
        } 
        // Exception - обычные исключения, которые можно обработать
        else if (e instanceof Exception) {
            System.out.println("Треба обробити");
        } 
        // Любой другой Throwable (на практике сюда почти никогда не попадаем)
        else {
            System.out.println("Поживемо - побачимо");
        }
    };

    public static void main(String[] args) {
    }
}
