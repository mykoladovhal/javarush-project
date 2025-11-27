package ua.javarush.task.task13.task1323;

/* 
Інтерфейс Updatable у класі Screen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable{

        @Override
        public void refresh() {

        }

        @Override
        public void onSelect() {

        }
    }
}
