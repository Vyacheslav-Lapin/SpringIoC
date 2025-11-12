package com.luxoft.springioc.example44;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        Expression testRegEx = (Expression) context.getBean("expressionBean");

        System.out.println(testRegEx.toString());
    }

}
