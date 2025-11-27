package ua.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Валюти
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Петро");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " має заначку у розмірі " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //напишіть тут ваш код
            allMoney.add(new USD(2000));
            allMoney.add(new Euro(5000));
            allMoney.add(new Hryvnia(10000));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
