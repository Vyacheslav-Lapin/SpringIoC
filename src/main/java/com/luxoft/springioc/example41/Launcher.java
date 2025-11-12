package com.luxoft.springioc.example41;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        UsualPerson person = (UsualPerson) context.getBean("personBean");

//		FYI: Another way to achieve the bean
//		person = context.getBean(UsualPerson.class);

        System.out.println(person);
    }

}
