package com.mycompany.pattern;

public class p12 {
    static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j>=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
