/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstpriject;

import com.mycompany.emp.*;

class Animal {

    void eat() {
        System.out.println("Animal Eating");
    }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Dog Eating");
    }

    void display() {
        super.eat();
        eat();
    }
}

public class FIrstPriject {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.display();
    }

}
