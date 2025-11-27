package ua.javarush.task.task16.task1622;

/* 
Послідовні виконання потоків Java Core: 6 рівень, 13 лекція
*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
            //напишіть тут ваш код
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
//            try {
//                join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;
                //напишіть тут ваш код
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Потік перерваний");
                }
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
