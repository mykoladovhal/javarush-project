package ua.javarush.task.task12.task1224;

/* 
Невідоме звірятко
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишіть тут ваш код
        if (o instanceof Cat)
            return "Кіт";

        if (o instanceof Tiger)
            return "Тигр";

        if (o instanceof Lion)
            return "Лев";

        if (o instanceof Bull)
            return "Бик";

        return "Тварина";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
