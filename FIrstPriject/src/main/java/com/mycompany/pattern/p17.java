package com.mycompany.pattern;

public class p17 {
    static void main() {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i >= 2 && j <= i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        for (int i = 2; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }
    }
}
