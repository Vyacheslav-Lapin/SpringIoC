package com.luxoft.springioc.example42;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        UsualPerson person = (UsualPerson) context.getBean("personBean");

        System.out.println(person);
        System.out.println(person.getFullCountryInfo());
    }

}
