package com.github.ideaseeker.list;

import com.github.ideaseeker.util.Util;

import java.util.ArrayList;

public class MyLinkedList {

    private Node head;
    private Node tail;

    public MyLinkedList(Node node) {
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

    public int[] toArray() {
        Node current = head;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(head.value);

        while (current.hasNext()) {
            current = current.next;
            result.add(current.value);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public void squareElements() {
        Node current = head;
        head.value = Util.square(head.value);
        while (current.hasNext()) {
            current = current.next;
            current.value = Util.square(current.value);
        }
    }
}

