package com.mycompany.firstpriject;

class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 10000; i++) {
            System.out.println("Name" + this.getName());
        }
    }
}

public class Thread_Proprits {
    static void main(String[] args) {

        MyThr1 t1 = new MyThr1("Yash1");
        MyThr1 t2 = new MyThr1("Yash2");
        MyThr1 t3 = new MyThr1("Yash3");
        MyThr1 t4 = new MyThr1("Yash4");
        MyThr1 t5 = new MyThr1("Yash5");
        MyThr1 t6 = new MyThr1("Yash6(Most Importance)");
        MyThr1 t7 = new MyThr1("Yash7");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();


        t6.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t7.setPriority(Thread.MIN_PRIORITY);


    }
}
