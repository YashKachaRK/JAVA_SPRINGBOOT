package com.mycompany.firstpriject;

import java.util.LinkedList;

public class LinkedList_learn {
    static void main() {
        System.out.println("Learn LinkedList ");

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.addFirst(0);

        System.out.println(list);

        list.addLast(4);

    }
}
