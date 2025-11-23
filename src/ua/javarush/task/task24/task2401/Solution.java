package ua.javarush.task.task24.task2401;

/* 
Створення свого інтерфейсу-маркера
*/

public class Solution {
    public static void main(String[] args) throws UnsupportedInterfaceMarkerException {
        SelfInterfaceMarkerImpl obj = new SelfInterfaceMarkerImpl();
        Util.testClass(obj);
    }

}
