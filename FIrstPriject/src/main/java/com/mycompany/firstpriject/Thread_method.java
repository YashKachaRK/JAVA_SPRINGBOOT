package com.mycompany.firstpriject;

class MyThr2 extends Thread {
    public MyThr2(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 10000; i++) {

            System.out.println("Name" + this.getName() + "  " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread_method {
    static void main(String[] args) throws InterruptedException {
        MyThr2 m1 = new MyThr2("Yash--------------------------");
        MyThr1 m2 = new MyThr1("Gracyyyyyyyy");
        m1.start();


        m2.start();
    }
}
