/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstpriject;

import java.util.Scanner;

/**
 *
 * @author yashk
 */
//class Person {
////    String grade; 
////    Person(String n) {
////        System.out.println("Constructor called ");
////        System.out.println(n);
////
////    }
////
////    Person(int a) {
////        System.out.println(a);
////    }
////    Person (String  grade){
////        this.grade = grade ;
////    }
////    void display (){
////        System.out.println(grade);
////    }
//    Person(){
//        this("Yash");
//        
//    }
//    Person(String name){
//        System.out.println(name);
//    }
//}

class Student {

    String name;
    int age;

    Student(String n, int a) {

        name = n;
        age = a;
    }

    Student(Student s) {

        name = s.name;
        age = s.age;
    }
}

public class FIrstPriject {

    public static void main(String[] args) {
        Student s1
                = new Student("Yash", 21);

        Student s2
                = new Student(s1);

        System.out.println(s2.name);

//        Person  p1 = new Person(25);
    }

}
