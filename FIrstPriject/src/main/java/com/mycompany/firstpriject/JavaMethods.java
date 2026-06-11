package com.mycompany.firstpriject;

public class JavaMethods {
    static float logic_sum(float a, float b) {
        return a + b;
    }

    static float logic_minus(float a, float b) {
        return a - b;
    }

    static float logic_multi(float a, float b) {
        return a * b;
    }

    static float logic_devide(float a, float b) {
        if (b == 0) {
            System.out.println("Connot divide into zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(logic_sum(1, 2));
        System.out.println(logic_devide(5, 0));
    }

}
