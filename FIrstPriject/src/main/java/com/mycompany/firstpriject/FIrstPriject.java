/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstpriject;

import java.io.IOException;

class Text {

    void readFile() throws IOException {
        throw new IOException("File not found");
    }
}

public class FIrstPriject {

    public static void main(String[] args) {
        // exception handling 
//        try {
//
//            int a = 0;
//            int b = 9;
//            System.out.println(b / a);
//        } catch (ArithmeticException e) {
//            System.out.println("Connot divide by 0");
//        } finally {
//            System.out.println("Program end  ");
//
//        }

        // throw keyqord
//            
//            int age = 15;
//            
//            if(age < 18 ){
//                throw new ArithmeticException("Not Eligible");
//            }
// throws
        Text t = new Text();

        try {
            t.readFile();

        }catch (IOException e ){
            System.out.println(e.getMessage());
        }

    }

}
