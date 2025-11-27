package ua.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution outer = new Solution();
        Solution outer2 = new Solution();
        outer.innerClasses = new  InnerClass[] {outer.new InnerClass(), outer.new InnerClass()};
        outer2.innerClasses = new  InnerClass[] {outer.new InnerClass(), outer.new InnerClass()};
        return new Solution[] {outer, outer2};
    }

    public static void main(String[] args) {

    }
}
