/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstpriject;

import com.mycompany.emp.*;

// run time polymorphism
class A {

    int age;
    String name;

    void show(int a) {
        age = a;
        System.out.println(age);
    }

}

class B extends A {

    void show(int a , String n) {
        age  = a;
        name = n;
        System.out.println(age + name);
//        System.out.println("CLass B");
    }
}

public class FIrstPriject {

    public static void main(String[] args) {

        B obj = new B();
        obj.show(23 );

    }

}
