package ua.javarush.task.task24.task2407;


public class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Sayable toSayable(final int i) {
        return () -> {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i; j++) sb.append("я");
            return name + ((i >= 1) ? String.format(" каже м%sу!", sb) : " спить.");
        };
    }
}