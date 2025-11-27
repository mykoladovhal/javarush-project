package ua.javarush.task.task17.task1704;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронізовані нотатки 2
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public synchronized void addNote(int index, String note) {
            System.out.println("Зараз буде додано нотатку [" + note + "] На позицію " + index);
            notes.add(index, note);
            System.out.println("Вже додана нотатка [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("Зараз буде видалено нотатку з позиції " + index);
            String note = notes.remove(index);
            System.out.println("Вже видалено нотатку [" + note + "] з позиції " + index);
        }
    }
}
