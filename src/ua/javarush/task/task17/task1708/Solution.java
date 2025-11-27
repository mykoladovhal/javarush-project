package ua.javarush.task.task17.task1708;

import java.util.ArrayList;
import java.util.List;

/* 
Нотатки для всіх
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public static volatile List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Зараз буде додано нотатку [" + note + "] На позицію " + index);
            notes.add(index, note);
            System.out.println("Вже додана нотатка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Зараз буде видалено нотатку з позиції " + index);
            String note = notes.remove(index);
            System.out.println("Вже видалено нотатку [" + note + "] з позиції " + index);
        }
    }
}
