package com.mycompany.pattern;

public class p10 {
    static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i+1; j++) {
                System.out.print(j);
            }

            for (int k = 1; k <= (i*2)-1; k++) {
                System.out.print("*");
            }
            for (int j =n-i+1; j >= 1 ; j--) {
                System.out.print(j);
            }

            System.out.println();
        }


        for (int i = n-1; i >= 1; --i) {

            for (int j = 1; j <= n - i+1; j++) {
                System.out.print(j);
            }

            for (int k = 1; k <= (i*2)-1; k++) {
                System.out.print("*");
            }
            for (int j =n-i+1; j >= 1 ; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
