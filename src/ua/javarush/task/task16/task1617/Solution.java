package ua.javarush.task.task16.task1617;

/* 
Відлік на перегонах
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //напишіть тут ваш код
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //напишіть тут ваш код
            while (!isInterrupted() && numSeconds > 0) {
                try {
                    System.out.println(numSeconds --);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Перервано!");
                    Thread.currentThread().interrupt();
                }
            }
           if (!isInterrupted())System.out.println("Марш!");
        }
    }
}
