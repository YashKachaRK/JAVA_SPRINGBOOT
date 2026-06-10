/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstpriject;

import java.util.Scanner;

/**
 *
 * @author yashk
 */
public class CustomException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new MyException();

            }
            System.out.println("DOne");

        } catch (MyException ex) {
            System.out.println(ex);
        }
    }
}

class MyException extends Exception {

    public MyException() {
        super("Age must be above than 18");
    }

}
