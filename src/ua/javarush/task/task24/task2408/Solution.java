package ua.javarush.task.task24.task2408;

import java.util.List;

/* 
Як уникнути Copy+Paste
*/

public class Solution {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}
