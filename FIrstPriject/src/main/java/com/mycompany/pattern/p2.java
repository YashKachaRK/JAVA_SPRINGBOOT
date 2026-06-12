package com.mycompany.pattern;

public class p2 {
    static void main() {

//        *
//        **
//        ***
//
        for (int i = 0; i < 5; i++) {
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
