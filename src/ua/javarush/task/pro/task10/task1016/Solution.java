package ua.javarush.task.pro.task10.task1016;

/* 
Прогноз погоди
*/

public class Solution {

    public static void showWeather(City city) {
        //напишіть тут ваш код
        System.out.printf("У місті %s сьогодні температура повітря %d", city.getName(), city.getTemperature());
    }

    public static void main(String[] args) {
        //напишіть тут ваш код
        showWeather(new City("Дубай", 40));
    }
}
