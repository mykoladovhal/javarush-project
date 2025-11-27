package ua.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Побудуй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root;

    public CustomTree() {
        this.root = new Entry<>("root");
    }

    public String getParent(String number) {
        Queue<Entry<String>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Entry<String> current = queue.poll();

            if (current.elementName != null && current.elementName.equals(number)) {
                return current.parent != null ? current.parent.elementName : null;
            }

            if (current.leftChild != null) queue.add(current.leftChild);
            if (current.rightChild != null) queue.add(current.rightChild);
        }

        return null; // если не найдено
    }

    @Override
    public boolean add(String elementName) {
        Queue<Entry<String>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Entry<String> current = queue.poll();

            if (current.isAvailableToAddChildren()) {
                Entry<String> newNode = new Entry<>(elementName);
                newNode.parent = current;

                if (current.availableToAddLeftChildren) {
                    current.leftChild = newNode;
                    current.availableToAddLeftChildren = false;
                } else {
                    current.rightChild = newNode;
                    current.availableToAddRightChildren = false;
                }

                return true;
            }

            if (current.leftChild != null) queue.add(current.leftChild);
            if (current.rightChild != null) queue.add(current.rightChild);
        }

        return false;
    }

    @Override
    public int size() {
        if (root == null) return 0;

        int count = 0;
        Queue<Entry<String>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Entry<String> current = queue.poll();
            count++;

            if (current.leftChild != null) queue.add(current.leftChild);
            if (current.rightChild != null) queue.add(current.rightChild);
        }

        return count - 1; // если root — фиктивный, например "0", то вычитаем
    }

    @Override
    public boolean remove(Object o) {
        if (!(o instanceof String)) throw new UnsupportedOperationException();

        Queue<Entry<String>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Entry<String> current = queue.poll();

            if (current.elementName != null && current.elementName.equals(o)) {
                Entry<String> parent = current.parent;

                if (parent != null) {
                    if (parent.leftChild == current) {
                        parent.leftChild = null;
                        parent.availableToAddLeftChildren = true;
                    } else if (parent.rightChild == current) {
                        parent.rightChild = null;
                        parent.availableToAddRightChildren = true;
                    }
                }

                return true;
            }

            if (current.leftChild != null) queue.add(current.leftChild);
            if (current.rightChild != null) queue.add(current.rightChild);
        }

        return false; // если элемент не найден
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;

        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }
}
