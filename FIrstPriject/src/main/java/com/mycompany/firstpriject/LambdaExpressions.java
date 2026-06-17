package com.mycompany.firstpriject;


import java.lang.classfile.Interfaces;

interface Demo {
    void math1(int a);
}

public class LambdaExpressions {
    static void main(String[] args) {
        // Anonymous class'
//        Demo obj = new Demo(){
//
//            @Override
//            public void math1() {
//                System.out.println("Math1");
//            }
//        };
//        obj.math1();


        // Lambda
        Demo g = (a) -> System.out.println("Demo"+a);
        g.math1(6);




    }
}
