package com.mycompany.firstpriject;


class Mythr extends Thread {
    public Mythr(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Run.........");
        }
    }
}

public class Thread_Cunstroctor {
    public static void main(String[] args) {
        Mythr t = new Mythr("Yash");
        Mythr t1 = new Mythr("Gracy");
        t.start();
        t1.start();
        System.out.println(t.getName());
        System.out.println("Thread is id :- " + t.getId());
        System.out.println("Thread is id t1:- " + t1.getId());
    }
}
