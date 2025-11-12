package com.luxoft.springioc.example22_primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FirstWorker implements Worker {

    @Override
    public void doTheJob() {
        System.out.println("I'm the boss and I want to do the job MYSELF!!!");
    }
}
