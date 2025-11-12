package com.luxoft.springioc.a;

public class A {

    private IB b;

    void test()
    {
        b.doTheJob();
    }

    public void setB(IB b) {
        this.b = b;
    }

    public IB getB() {
        return b;
    }
}
