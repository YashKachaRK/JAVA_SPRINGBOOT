package com.mycompany.firstpriject;

public class Multithreading extends  Thread{
    public  void  run(){
        System.out.println("Running...........");
    }

    static void main(String[] args) {
        Multithreading  m1  = new Multithreading();
        m1.start();
    }
}
