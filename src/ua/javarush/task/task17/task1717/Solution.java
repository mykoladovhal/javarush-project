package ua.javarush.task.task17.task1717;

/* 
Зайва синхронізація
*/

public class Solution {
    public static void main(String[] args) {
        Thread myThread1 = new Thread(new MyRunnable("Микола", 35));
        Thread myThread2 = new Thread(new MyRunnable("Олена", 21));
        Thread myThread3 = new Thread(new MyRunnable("Іван", 19));
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }

    public static synchronized void printInfo(String name, int age) {
        for (int i = 1; i <= 5; i++) {
                System.out.print(i);
                System.out.print(".");
                System.out.print(" ");
                System.out.print("Мене");
                System.out.print(" ");
                System.out.print("звати");
                System.out.print(" ");
                System.out.print(name);
                System.out.print(",");
                System.out.print(" ");
                System.out.print("мені");
                System.out.print(" ");
                System.out.print(age);
                System.out.println();
        }
    }

    public static class MyRunnable implements Runnable {
        private final String name;
        private final int age;

        public MyRunnable(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public void run() {
            printInfo(name, age);
        }
    }
}
