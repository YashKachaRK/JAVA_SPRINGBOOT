package com.mycompany.pattern;

public class p16 {
    static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
