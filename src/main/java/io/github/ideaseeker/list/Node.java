package io.github.ideaseeker.list;

public class Node {

    public Node(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    Node next;
    int value;

    @Override
    public String toString() {
        return "Node(" + value + ")";
    }
}
