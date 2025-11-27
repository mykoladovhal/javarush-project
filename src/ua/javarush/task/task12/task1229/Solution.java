package ua.javarush.task.task12.task1229;

/* 
Батько класу CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }
    public static class A {
        public void workHard(){}
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends A implements Businessman {

    }
}
