package ua.javarush.task.pro.task14.task1412;

/* 
Групування винятків
*/

public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println("Програма працює від паркану");
            Thread.sleep(1000);
            System.out.println("до обіду");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Стався виняток на літеру N");
        } catch (IllegalArgumentException | InterruptedException | IllegalStateException e) {
            System.out.println("Стався виняток на літеру I");
        } catch (ClassCastException e) {
            System.out.println("Стався виняток на літеру C");
        }
    }
}
