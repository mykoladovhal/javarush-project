package ua.javarush.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        return switch (countOfCorner) {
            case 3 -> "Трикутник";
            case 4 -> "Чотирикутник";
            case 5 -> "П'ятикутник";
            case 6 -> "Шестикутник";
            case 7 -> "Семикутник";
            case 8 -> "Восьмикутник";
            default -> "Інша фігура";
        };
    }
}
