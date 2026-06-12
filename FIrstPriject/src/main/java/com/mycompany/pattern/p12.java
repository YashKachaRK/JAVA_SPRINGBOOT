package com.mycompany.pattern;

public class p12 {
    static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n * 2) - 1; j++) {
                if (j % 2 == 1 ) {

                    System.out.print("*");

                } else {
                    System.out.print(j);

                }
            }
            System.out.println();
        }
    }
}
