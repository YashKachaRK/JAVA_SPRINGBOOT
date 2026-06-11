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
        t.start();
        System.out.println(t.getName());
        System.out.println("Thread is id :- "+ t.getId());
    }
}
