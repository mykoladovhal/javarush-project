package ua.javarush.task.task24.task2407;

import java.util.List;

/* 
Реалізація інтерфейсу за допомогою локального класу
*/

public class Solution {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}
