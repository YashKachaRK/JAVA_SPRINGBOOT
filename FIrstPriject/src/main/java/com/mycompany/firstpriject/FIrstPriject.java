/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstpriject;

abstract class A {

    A() {
        System.out.println("Parent coustructor");
    }

    abstract void show(); // abstact class ni body no hoi without body j hoi

    abstract void display();
}

class B extends A {
    B(){
        super();
        System.out.println("Child class");
    }
    public void show() {
        System.out.println("Hey!! ");
    }

    public void display() {
        System.out.println("DIsplay ");
    }
}

public class FIrstPriject {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }

}
