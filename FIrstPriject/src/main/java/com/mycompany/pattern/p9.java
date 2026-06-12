package com.mycompany.pattern;

public class p9 {
    static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            // agad space add thay
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // agad increse
            for (int k = 1; k <= i ; k++) {
                System.out.print(k);
            }

            // pacchad descrese
            for (int z = i-1; z >=1 ; z--) {
                System.out.print(z);
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print(k);
            }
            for (int z = i-1; z >=1 ; z--) {
                System.out.print(z);
            }
            System.out.println();
        }
    }
}
