package com.luxoft.springioc.example22_primary;

import org.springframework.stereotype.Service;

@Service
public class SecondWorker implements Worker {

    @Override
    public void doTheJob() {
        System.out.println("Just doing my job...");
    }
}
