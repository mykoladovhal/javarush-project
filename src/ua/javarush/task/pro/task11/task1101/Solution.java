package ua.javarush.task.pro.task11.task1101;

/* 
Сонячна система — наш дім
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println("Людство живе в Сонячній системі.");
        System.out.printf("Її вік близько %d років.\n", SolarSystem.age);
        System.out.printf("У Сонячній системі %d відомих планет.\n", SolarSystem.planetsCount);
        System.out.printf("Так само, як і більшість зоряних систем, вона має %d зорю.\n", SolarSystem.starsCount);
        System.out.printf("Зорю на ім'я %s.\n",SolarSystem.starName);
        System.out.printf("Відстань до центра галактики становить %d світлових років.\n", SolarSystem.galacticCenterDistance);
        System.out.println("Кожен мешканець Сонячної системи має знати цю інформацію!");

    }
}
