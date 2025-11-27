package ua.javarush.task.task13.task1328;

/* 
Битва роботів
*/

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Аміго");
        Robot enemy = new Robot("Згибальник-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(Robot robotFirst, Robot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotSecond.defense();
        System.out.println(String.format("%s атакував робота %s, атакована %s, захищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }
}
