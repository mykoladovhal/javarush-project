package ua.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закріплюємо патерн Singleton
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }
    //add static block here - додайте статичний блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реалізуйте завдання №5 тут
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String planet = reader.readLine();
//            thePlanet = switch (planet) {
//                case Planet.EARTH -> Earth.getInstance();
//                case Planet.SUN -> Sun.getInstance();
//                case Planet.MOON -> Moon.getInstance();
//                default -> null;
//            };
            switch (planet) {
                case Planet.EARTH:
                    thePlanet = Earth.getInstance();
                    break;
                case Planet.SUN:
                    thePlanet = Sun.getInstance();
                    break;
                case Planet.MOON:
                    thePlanet = Moon.getInstance();
                    break;
                default:
                    thePlanet = null;
                    break;
            }

        } catch (IOException _) {}
    }
}
