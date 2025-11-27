package ua.javarush.task.task13.task1307;

/* 
Параметризований інтерфейс
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>// допишіть тут ваш код
    {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}