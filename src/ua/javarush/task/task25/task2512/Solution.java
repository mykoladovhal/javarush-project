package ua.javarush.task.task25.task2512;

import java.util.LinkedList;
import java.util.List;

/* 
Живемо своїм розумом
*/

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        java.util.Deque<Throwable> stack = new java.util.LinkedList<>();
        Throwable throwable = e;

        // Собрать всю цепочку
        while (throwable != null) {
            stack.push(throwable);
            throwable = throwable.getCause();
        }

        // Вывести с конца (от причины к главному)
        while (!stack.isEmpty()) {
            Throwable th = stack.pop();
            System.out.println(th.getClass().getName() + ": " + th.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        Thread.currentThread().setUncaughtExceptionHandler(new Solution());
        throw new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")));
    }
}
