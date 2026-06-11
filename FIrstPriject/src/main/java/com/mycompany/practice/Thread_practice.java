package com.mycompany.practice;


class Thread1 extends  Thread{
   public void run(){
       for (int i = 0 ; i <= 200 ; i++){
           System.out.println("Good moring");
       }
   }
}

class Thread2 extends Thread{
    public void run(){
        for(int i = 0 ; i<=200; i++){
            System.out.println("Yash Kachjaa");
        }
    }
}


public class Thread_practice {
    static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
