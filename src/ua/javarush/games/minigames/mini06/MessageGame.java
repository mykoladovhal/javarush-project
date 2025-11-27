package ua.javarush.games.minigames.mini06;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Діалогові вікна
*/

public class MessageGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        //напишіть тут ваш код
        showMessageDialog(Color.ORANGE,"Ви виграли", Color.GREEN, 12);

    }

    @Override
    public void onMouseRightClick(int x, int y) {
        //напишіть тут ваш код
        showMessageDialog(Color.ORANGE,"Ви програли", Color.RED, 12);
    }
}
