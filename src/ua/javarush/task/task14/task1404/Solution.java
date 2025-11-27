package ua.javarush.task.task14.task1404;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Коти
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        while (!(name = reader.readLine()).isEmpty()) System.out.println(CatFactory.getCatByKey(name).toString());


    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vasyl":
                    cat = new MaleCat("Василь");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kisa":
                    cat = new FemaleCat("Кисюлька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я вуличний кіт " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солідний кошак на ім'я " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - мила кицька на ім'я " + getName();
        }
    }
}
