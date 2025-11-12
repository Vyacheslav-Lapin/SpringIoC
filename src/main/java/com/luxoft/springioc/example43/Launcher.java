package com.luxoft.springioc.example43;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        Operators op = (Operators) context.getBean("operatorsBean");

        System.out.println(op);
    }

}
