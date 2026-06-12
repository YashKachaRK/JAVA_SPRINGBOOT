package com.mycompany.pattern;

public class p15 {
    static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
