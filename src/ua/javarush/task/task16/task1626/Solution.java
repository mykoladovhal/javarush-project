package ua.javarush.task.task16.task1626;

/* 
Створення за зразком
*/

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Зменшуємо").start();
        new Thread(new CountUpRunnable(), "Збільшуємо").start();
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexUp;

        @Override
        public void run() {

            try {

                for (; Solution.number > countIndexUp++; ) {
                    System.out.println(this);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
        //напишіть тут ваш код
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
