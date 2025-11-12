package com.luxoft.springioc.a;

public class LogDecorator implements IB {

    private IB b;

    public LogDecorator() {
    }

    public LogDecorator(IB b) {
        this.b = b;
    }

    @Override
    public void doTheJob() {

        System.out.println("--> LogDecorator before");

        b.doTheJob();

        System.out.println("--> LogDecorator after");
    }

    public void setB(IB b) {
        this.b = b;
    }
}
