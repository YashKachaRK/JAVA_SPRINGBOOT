/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstpriject;

interface A{
    int num = 2;
    void show(); // by defult public j hoi 
    // interace no object no banavi sake;
    
    default void run(){
        System.out.println("Run");
    }// using defult apade ahiya j body api saki chhi
    
}
interface  C {
    void display();
}
// interface mate implements no use thay chhe
class B implements A , C{
    public void show (){
        System.out.println("Show");
    }
    public void display(){
        System.out.println("Class B");
    }
}

public class FIrstPriject {

    public static void main(String[] args) {
       B b = new B();
       b.show();
       b.display();
       b.run(); 
    }

}
