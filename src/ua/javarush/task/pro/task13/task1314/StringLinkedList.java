package ua.javarush.task.pro.task13.task1314;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;
        last.prev = newNode;
    }

    public String get(int index) {
        //напишіть тут ваш код
        int count = 0;
        Node current;
        for (current = first.next; current != last.prev && count != index; current = current.next, count++) {}
        if (index < 0 || index > count) return null;
        return current.value;

    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
