/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstpriject;

import java.util.Scanner;

class Person {

    private int age;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

}

public class FIrstPriject {

    public static void main(String[] args) {

        Person p = new Person();
        p.setAge(25);
        System.out.println(p.getAge());

    }

}
