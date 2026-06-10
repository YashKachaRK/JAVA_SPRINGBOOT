package com.mycompany.firstpriject;

import java.util.Stack;

public class LinkList {

    static void main() {
        Stack<String> fruits = new Stack<>();

        fruits.push("A");
        fruits.push("AB");
        fruits.push("AC");
        fruits.push("AD");

        System.out.println(fruits);
        System.out.println("pop");
        fruits.pop();
        System.out.println(fruits);

        System.out.println("Peek :- "+fruits.peek());
        System.out.println(fruits.isEmpty());
    }
}
