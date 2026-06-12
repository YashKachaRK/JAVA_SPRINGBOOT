package com.mycompany.pattern;

public class p4 {
    static void main(String[] args) {
//        1
//        22
//        333
//        4444

//        r - 4 , c-4

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
