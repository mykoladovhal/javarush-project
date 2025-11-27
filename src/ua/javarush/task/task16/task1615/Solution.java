package ua.javarush.task.task16.task1615;

/* 
Аеропорт
*/

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // злітна смуга

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Літак #1");
        Plane plane2 = new Plane("Літак #2");
        Plane plane3 = new Plane("Літак #3");
    }

    private static void waiting() {
        // напишіть тут ваш код
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }

    }

    private static void takingOff() {
        // виправ цей метод
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean isAlreadyTakenOff = false;
            while (!isAlreadyTakenOff) {
                if (RUNWAY.trySetTakingOffPlane(this)) {    // якщо злітна смуга вільна, займаємо її
                    System.out.println(getName() + " злітає");
                    takingOff();// злітає
                    System.out.println(getName() + " вже у небі");
                    isAlreadyTakenOff = true;
                    RUNWAY.setTakingOffPlane(null);
                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  // якщо злітна смуга зайнята літаком
                    System.out.println(getName() + " очікує");
                    waiting(); // очікує
                }
            }
        }
    }

    public static class Runway { // злітна смуга
        private Thread t;

        public Thread getTakingOffPlane() {
            return t;
        }

        public void setTakingOffPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetTakingOffPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

