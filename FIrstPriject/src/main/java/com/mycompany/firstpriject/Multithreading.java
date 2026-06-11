package com.mycompany.firstpriject;

//class DownloadTask extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("Downloading..........." + i);
//        }
//    }
//}
//
//class Running extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("Running..........." + i);
//        }
//    }
//}


class Display implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i+"  "+"Display..........");
        }
    }
}

class Run implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i+"  "+"Running..........");
        }

    }
}

public class Multithreading {


    public static void main(String[] args) {
//        Running r1 = new Running();
//        r1.start();
//
//
//        DownloadTask d1 = new DownloadTask();
//        d1.start();


        // start method peralary work kare chhe
        // run method pela r1 thay chhe and d1 pachhi

        // runnable ------------



        Thread t1 = new Thread( new Display());
        Thread t2 = new Thread(new Run());

        t1.start();
        t2.start();
         // runnble kyare thodik thodik var work change kare
        // Thread direct change karer
    }

}
