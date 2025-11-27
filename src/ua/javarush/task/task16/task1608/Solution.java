package ua.javarush.task.task16.task1608;

/* 
Просування на політичних дебатах
*/

public class Solution {
    public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician ivanov = new Politician("Іванов");
        ivanov.join();
        Politician petrenko = new Politician("Петренко");
        Politician sydorchuk = new Politician("Сидорчук");

        while (ivanov.getSpeechCount() + petrenko.getSpeechCount() + sydorchuk.getSpeechCount() < totalSpeechCount) {
        }

        System.out.println(ivanov);
        System.out.println(petrenko);
        System.out.println(sydorchuk);
    }

    public static class Politician extends Thread {
        private volatile int utteranceCount;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s виголосив промову %d раз", getName(), getSpeechCount());
        }
    }
}

