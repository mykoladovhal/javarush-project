package ua.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC7E", BODY_SIGN = "\u26AB";
    private List<GameObject> snakeParts = new ArrayList<>();
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;

    public Snake(int x, int y) {

        for (int i = 0; i < 3; i++) {
            snakeParts.add(new GameObject(x + i, y));
        }
    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            GameObject part = snakeParts.get(i);
            game.setCellValueEx(part.x, part.y, Color.NONE,
                    (i == 0) ? HEAD_SIGN : BODY_SIGN,
                    (isAlive) ? Color.BLACK : Color.RED, 75);
        }
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        if (checkCollision(newHead)) {
            isAlive = false;
            return;
        }

        if (newHead.x >= SnakeGame.WIDTH
                || newHead.x < 0
                || newHead.y >= SnakeGame.HEIGHT
                || newHead.y < 0) {
            isAlive = false;
            return;
        }
        if (newHead.x == apple.x && newHead.y == apple.y) {
            apple.isAlive = false;
        } else removeTail();
        snakeParts.add(0, newHead);

    }

    public GameObject createNewHead() {
        GameObject head = snakeParts.get(0);

        GameObject newHead;
        switch (this.direction) {
            case UP:
                newHead = new GameObject(head.x, head.y - 1);
                break;
            case DOWN:
                newHead = new GameObject(head.x, head.y + 1);
                break;
            case LEFT:
                newHead = new GameObject(head.x - 1, head.y);
                break;
            case RIGHT:
                newHead = new GameObject(head.x + 1, head.y);
                break;
            default:
                throw new IllegalStateException("Unknown direction: " + this.direction);
        }
        return newHead;
    }

    public void removeTail() {

        snakeParts.remove(snakeParts.size() - 1);
    }

    public void setDirection(Direction direction) {

        if ((this.direction == Direction.LEFT || this.direction == Direction.RIGHT) && snakeParts.get(0).x == snakeParts.get(1).x) {
            return;
        }
        if ((this.direction == Direction.UP || this.direction == Direction.DOWN) && snakeParts.get(0).y == snakeParts.get(1).y) {
            return;
        }

        if ((this.direction == Direction.LEFT && direction == Direction.RIGHT) ||
                (this.direction == Direction.RIGHT && direction == Direction.LEFT) ||
                (this.direction == Direction.UP && direction == Direction.DOWN) ||
                (this.direction == Direction.DOWN && direction == Direction.UP)) {
            return;
        }
        this.direction = direction;


    }

    /*public boolean checkCollision(GameObject gameObject) {
        return snakeParts.contains(gameObject);
    }*/

    public boolean checkCollision(GameObject gameObject) {
        for (GameObject part : snakeParts) {
            if (part.x == gameObject.x && part.y == gameObject.y) {
                return true;
            }
        }
        return false;
    }

    public int getLength() {
        return snakeParts.size();
    }
}
