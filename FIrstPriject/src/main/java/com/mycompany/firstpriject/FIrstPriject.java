/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstpriject;

import java.util.Scanner;

/**
 *
 * @author yashk
 */


class Person {
    String name ;
    int age ;
    
    void input (String n , int a  ){
        name  = n; 
        age = a;
        
    }
    
    void output (){
        System.out.println("Name " + name);
        System.out.println("Age "+age);
    }
}
public class FIrstPriject {

    public static int sum(int a, int b) {
        System.out.println(a + b);
        return 0;
    }

    public static void main(String[] args) {
        sum(10, 10);
        
        Person person = new Person();
        
        person.input("Yash", 21);
        person.output();
        
    }
}
