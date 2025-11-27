package ua.javarush.task.task20.task2016;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* 
Мінімум змін
*/

public class Solution {
    public class A implements Serializable{
        String name = "A";

        public A(String name) {
            this.name += name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public class B extends A {
        String name = "B";

        public B(String name) {
            super(name);
            this.name += name;
        }
    }

    public class C extends B {
        String name = "C";

        public C(String name) {
            super(name);
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.C c = solution.new C("Hello");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c.ser"))) {
            out.writeObject(c);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при сериализации", e);
        }
    }
}
