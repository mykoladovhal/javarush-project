package ua.javarush.task.task23.task2310;

/* 
Напруж звивини!
*/

public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    private void sout() {
        new Solution("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("Ріша").sout();
    }
}
