package ua.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишіть тут ваш код
        Node node = new Node(), current;
        node.value = value;
        if (first.next == null) {
            first.next = node;
            last.prev = node;
            node.prev = first;
            node.next = last;
            return;
        }
        current = first.next;
        while (current.next != last) current = current.next;
        current.next = node;
        node.prev = current;
        node.next = last;
        last.prev = node;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
