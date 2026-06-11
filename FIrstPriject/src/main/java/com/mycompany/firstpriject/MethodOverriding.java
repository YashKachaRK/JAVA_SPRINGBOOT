package com.mycompany.firstpriject;


class P {
    void dis() {
        System.out.println("Display");
    }
}

class c extends P {
    @Override
    void dis() {
        System.out.println("Display Chi;ld");

    }
}

public class MethodOverriding {

    static void main(String[] args) {
        P ap = new c();
        ap.dis();
    }
}
