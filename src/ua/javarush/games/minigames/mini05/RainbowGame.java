package ua.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Кольори веселки
*/

public class RainbowGame extends Game {

    //напишіть тут ваш код

    @Override
    public void initialize() {
        setScreenSize(10, 7);
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET};
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 7; y++) {
                setCellColor(x, y, colors[y]);
            }
        }
    }
}
