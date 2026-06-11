package com.mycompany.firstpriject;

class DownloadTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Downloading..........." + i);
        }
    }
}

public class Multithreading extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Running..........." + i);
        }
    }

    static void main(String[] args) {
        Multithreading m1 = new Multithreading();
        m1.start();

        DownloadTask d1 = new DownloadTask();
        d1.start();
    }

}
