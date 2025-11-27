package ua.javarush.task.task16.task1618;

/* 
Знову interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //напишіть тут ваш код
        TestThread thread = new TestThread();
        thread.start();
        thread.interrupt();

    }

    //Add your code below - додай код нижче
    public static class TestThread extends Thread {

        @Override
        public void run() {
            while (isInterrupted()) {

            }
        }
    }
}