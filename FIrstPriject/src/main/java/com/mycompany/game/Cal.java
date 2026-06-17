package com.mycompany.game;


import java.util.Scanner;

public class Cal {
    public void print() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }

    static void main(String[] args) {
        Cal obj = new Cal();

        Scanner sc = new Scanner(System.in);

        while (true) {
            obj.print();

            System.out.println("Choose 1 -5");
            int n = sc.nextInt();

            if (n == 5) {
                System.out.println("Calculator close");
                break;
            }

            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter Second number");
            int b = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Ans: " + (a + b));
                    break;

                case 2:
                    System.out.println("Ans: " + (a - b));
                    break;

                case 3:
                    System.out.println("Ans: " + (a * b));
                    break;

                case 4:
                    try {
                        System.out.println("Ans: " + (a / b));
                        break;
                    }catch (Exception e){
                        System.out.println(e);
                    }
                default:
                    System.out.println("Invalid Choise");


            }
        }


    }
}
