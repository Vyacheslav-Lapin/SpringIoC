package com.luxoft.springioc.example19;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {

  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example19/application-context.xml");

    if (context.getBean("classic") instanceof ExampleBean classic) {

      println(classic.getEmail());

      ExampleBean pnamespace = (ExampleBean) context.getBean("p-namespace");
      println(pnamespace.getEmail());

      Person john_classic = (Person) context.getBean("john-classic");
      println(john_classic.getName());
      println(john_classic.getSpouse().getName());

      Person john_modern = (Person) context.getBean("john-modern");
      println(john_modern.getName());
      println(john_modern.getSpouse().getName());

      Person jane = (Person) context.getBean("jane");
      println(jane.getName());
    }
  }


}
