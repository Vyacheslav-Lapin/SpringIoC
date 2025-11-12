package com.luxoft.springioc.example22_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan
public class Launcher
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Launcher.class);

        Factory factory = context.getBean(Factory.class);
        factory.getWorker().doTheJob();
    }

    @Service
    static class Factory
    {
        // TODO Go to FirstWorker class and uncomment annotations
        @Autowired
        private Worker worker;

        public Worker getWorker() {
            return worker;
        }
    }

}
