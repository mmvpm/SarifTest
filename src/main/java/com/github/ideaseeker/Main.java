package com.github.ideaseeker;

import com.github.ideaseeker.list.MyLinkedList;
import com.github.ideaseeker.list.Node;
import com.github.ideaseeker.util.Util;

public class Main {

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList(new Node(5));
        myList.add(new Node(2));
        myList.add(new Node(7));
        System.out.println(myList);
        // [5] -> [2] -> [7] ->

        myList.squareElements();
        System.out.println(myList);
        // [25] -> [4] -> [49] ->

        int[] sortedList = Util.bubbleSort(myList.toArray());
        for (int value : sortedList) {
            System.out.print(value + " ");
        }
        // 4 25 49
    }
}
