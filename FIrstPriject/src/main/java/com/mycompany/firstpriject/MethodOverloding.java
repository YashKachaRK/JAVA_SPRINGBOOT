package com.mycompany.firstpriject;

public class MethodOverloding {
    int add (int a , int b){
        return a+b;
    }
    int add (int a , int b , int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloding m = new MethodOverloding();
        System.out.println(m.add(1,2));
        System.out.println(m.add(1,2,3));
    }
}
