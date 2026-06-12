package com.mycompany.pattern;

public class p5 {
    static void main() {
//        ****
//        ***
//        **
//        *

//        for (int i = 1; i < 5; i++) {
//            for (int j = 5; j>i ; --j) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = n-1; j >= i; --j) {
                System.out.print(n - j);
            }
            System.out.println();
        }
    }
}
