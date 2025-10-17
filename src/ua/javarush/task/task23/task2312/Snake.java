package ua.javarush.task.task23.task2312;

import java.util.ArrayList;

public class Snake {
    private SnakeDirection direction;
    private boolean isAlive;
    private final ArrayList<SnakeSection> sections;

    public Snake(int x, int y) {
        sections = new ArrayList<>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getX() {
        return sections.getFirst().getX();
    }

    public int getY() {
        return sections.getFirst().getY();
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public ArrayList<SnakeSection> getSections() {
        return sections;
    }

    public void move() {
        if (!isAlive) return;

        if (direction == SnakeDirection.UP)
            move(0, -1);
        else if (direction == SnakeDirection.RIGHT)
            move(1, 0);
        else if (direction == SnakeDirection.DOWN)
            move(0, 1);
        else if (direction == SnakeDirection.LEFT)
            move(-1, 0);
    }

    private void move(int dx, int dy) {
        SnakeSection head = sections.getFirst();
        head = new SnakeSection(head.getX() + dx, head.getY() + dy);

        checkBorders(head);
        if (!isAlive) return;

        checkBody(head);
        if (!isAlive) return;

        Mouse mouse = Room.game.getMouse();
        if (head.getX() == mouse.getX() && head.getY() == mouse.getY())
        {
            sections.addFirst(head);
            Room.game.eatMouse();
        } else
        {
            sections.addFirst(head);
            sections.removeLast();
        }
    }

    private void checkBorders(SnakeSection head) {
        if ((head.getX() < 0 || head.getX() >= Room.game.getWidth()) || head.getY() < 0 || head.getY() >= Room.game.getHeight()) {
            isAlive = false;
        }
    }

    private void checkBody(SnakeSection head) {
        if (sections.contains(head)) {
            isAlive = false;
        }
    }
}
