package ua.javarush.games.snake;

import java.util.Objects;

public class GameObject {
    public int x, y;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                 // same object
        if (o == null || getClass() != o.getClass()) return false;  // null or class mismatch
        GameObject that = (GameObject) o;           // cast
        return x == that.x && y == that.y;          // field comparison
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}