package ua.javarush.task.pro.task06.task0613;

/* 
Міста-гіганти
*/

public class Solution {
    public static String city = "Токіо";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Делі", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String city, double population){
        System.out.println("Населення міста " + city + " становить " + population + " млн осіб.");
        System.out.println("А тимчасом у найбільш населеному місті " + Solution.city + " мешкає " + Solution.population + " млн осіб.");
    }
}
