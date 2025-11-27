package ua.javarush.games.minigames.mini11;

import com.javarush.engine.cell.Color;

/* 
Зафарбовуємо поле
*/

public class FillOrangeGame extends FillGame {

    //напишіть тут ваш код

    @Override
    public void fill() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                setCellColor(x, y, Color.ORANGE);
            }
        }
    }
}
