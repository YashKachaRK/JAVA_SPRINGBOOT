package com.mycompany.pattern;

public class p3 {
    static void main(String[] args) {

//    *
//  **
// ***
//****
        int n = 4;
//        r -4 , c -4 , space - 3 , 2 ,1 ,0
        for (int i = 1; i <= n; i++) {
            // row ne print kare chhe i loop

            //k loop space ne print karse
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
