package com.luxoft.springioc.a;

public class TransactionDecorator implements IB {

    private IB b;

    public TransactionDecorator() {
    }

    public TransactionDecorator(IB b) {
        this.b = b;
    }

    @Override
    public void doTheJob() {

        System.out.println("--> TransactionDecorator before");

        b.doTheJob();

        System.out.println("--> TransactionDecorator after");
    }

    public void setB(IB b) {
        this.b = b;
    }
}
