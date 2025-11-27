package ua.javarush.task.task15.task1503;

/* 
ООП — автівки
*/

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            //напишіть тут ваш код
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            //напишіть тут ваш код
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class LuxuriousCar {

        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу їздити на ";
        public static String LUXURIOUS_CAR = "розкішному авто";
        public static String CHEAP_CAR = "дешевому авто";
        public static String FERRARI_NAME = "Феррарі";
        public static String LANOS_NAME = "Ланосі";
    }
}
