package ua.javarush.task.task15.task1528;

/* 
ООП. Hryvnia — теж гроші
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - додай код нижче
    public static class Hryvnia extends Money {
        public double amount = 123d;

        public Hryvnia getMoney() {
            return this;
        }

        @Override
        public Object getAmount() {
            return amount;
        }
    }
}
