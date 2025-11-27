package ua.javarush.games.minigames.mini04;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Рахуємо клітини
*/

public class CountGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        showGrid(false);
        for (int j = 0; j < 50; j++) {
            int x = getRandomNumber(10);
            int y = getRandomNumber(10);
            setCellColor(x, y, Color.GREEN);
            setCellNumber(x, y, getRandomNumber(100));
        }
        showResult();
    }

    public void showResult() {
        //напишіть тут ваш код
        int count = 0, sum = 0;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (getCellColor(x, y) == Color.GREEN) {
                    count++;
                    sum += getCellNumber(x, y);
                }
            }
        }
        printSum(sum);
        printCountOfGreenCells(count);
    }

    private void printSum(int sum) {
        System.out.println("Сума всіх чисел = " + sum);
    }

    private void printCountOfGreenCells(int count) {
        System.out.println("Кількість зелених клітин = " + count);
    }
}
