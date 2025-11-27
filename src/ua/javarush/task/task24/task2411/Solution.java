package ua.javarush.task.task24.task2411;

/* 
Згадаймо успадкування
*/

public class Solution extends C{
    private class A {
        protected String value = "A";

        public A() {
            System.out.print(value);
        }
    }

    private A a = new A() {
        {
            value = "Y";
            if (super.getClass().getName().contains(".Solution$")) {
                System.out.print(value);
            }
        }
    };

    public Solution() {
        System.out.print("S");
    }

    public static void main(String[] args) {
        new Solution();
    }
}



