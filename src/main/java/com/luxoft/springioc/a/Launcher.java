package com.luxoft.springioc.a;

public class Launcher {

    public static void main(String[] args) {

        IB b = new B();

        A a = new A();
        a.setB(b);

        a.test();

        System.out.println("============");
        a.setB(new LogDecorator(new TransactionDecorator(a.getB())));
        a.test();
    }
}
