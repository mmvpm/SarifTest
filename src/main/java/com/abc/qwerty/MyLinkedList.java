package com.abc.qwerty;

class Node {
    public Node(String value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    Node next;
    String value;

    int foo(int i) {
        return 1 / i;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }
}

public class MyLinkedList {

    private Node head;
    private Node tail;

    MyLinkedList(Node node) {
        head = node;
        tail = head;
    }

    public void add(Node node) {
        tail.setNext(node);
        tail = node;
    }

    public String toString() {
        return asString(head);
    }

    private static String asString(Node head) {

        StringBuilder stringBuilder = new StringBuilder();
        Node current = head;

        while (current.hasNext()) {
            stringBuilder.append("[");
            stringBuilder.append(current.value);
            stringBuilder.append("] -> ");
            current = current.next;
        }

        stringBuilder.append("[");
        stringBuilder.append(current.value);
        stringBuilder.append("] -> ");
        return stringBuilder.toString();
    }

    public void reverse() {
        Node prev = null;
        Node cur = head;
        Node next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            head = cur;
            cur = next;
        }
    }

    public void reverseRecursively() {
        Node oldTail = tail;
        tail = head;
        recurrentStep(head);
        head = oldTail;
    }

    private void recurrentStep(Node node) {
        Node left = node;
        Node right = node.next;

        if (right == null) return;

        boolean goBack = right.next == null;

        if (goBack) {
            right.next = left;
            return;
        }

        recurrentStep(right);

        right.next = left;
    }

    public boolean hasCycle() {

        if (head.next == null) return false;

        Node slowPointer = head;
        Node fastPointer = head.next;

        while (fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) {
                return true;
            }
        }

        return false;
    }

    public Node getHead() {
        return head;
    }
}

