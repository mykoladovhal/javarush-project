package ua.javarush.task.task16.task1624;

/* 
Послідовні виконання потоків Java Core: 6 рівень, 13 лекція
*/

public class Solution {
    public static MyThread t = new MyThread();
    static String message = "inside main ";

    static {
        t.start();

    }

    public static void main(String a[]) throws Exception {
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    static class MyThread extends Thread {
        String message = "inside MyThread ";

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Solution.sleep();
            }
        }
    }
}