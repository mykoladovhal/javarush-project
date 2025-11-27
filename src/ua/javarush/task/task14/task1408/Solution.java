package ua.javarush.task.task14.task1408;

/* 
Куряча фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.FRANCE);
        hen.getCountOfEggsPerMonth();

    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишіть тут ваш код
            if (country == Country.POLAND) hen = new PolishHen();
            if (country == Country.FRANCE) hen = new FrenchHen();
            if (country == Country.MOLDOVA) hen = new MoldovanHen();
            if (country == Country.UKRAINE) hen = new UkrainianHen();
            return hen;
        }
    }
}
