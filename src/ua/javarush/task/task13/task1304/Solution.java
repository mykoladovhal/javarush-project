package ua.javarush.task.task13.task1304;

/* 
Selectable та Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    // напишіть тут ваш клас
    public static class Screen implements Selectable, Updatable{
        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
