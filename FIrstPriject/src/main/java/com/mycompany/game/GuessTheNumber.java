package com.mycompany.game;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int number = 15;
        int gusse;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Number");
            gusse = sc.nextInt();
            if (gusse > number) {
                System.out.println("big");
            } else if (gusse < number) {
                System.out.println("Small");
            } else {
                System.out.println("🎉 Correct! You guessed the number.");
            }
        } while (gusse != number);
        sc.close();
    }
}
