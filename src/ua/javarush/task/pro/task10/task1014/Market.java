package ua.javarush.task.pro.task10.task1014;

/* 
Купи 10 батонів
*/

public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Куплено 10 батонів");
        } else {
            System.out.println("Куплено 1 батон");
        }
    }
}
