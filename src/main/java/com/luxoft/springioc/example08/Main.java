package com.luxoft.springioc.example08;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example08/application-context.xml");

    if (context.getBean("smithPerson") instanceof Person(String name, Company(String companyName))) {
      println(name);
      println(companyName);
    }
  }
}

record Company(String name) {
}

record Person(String name,
              Company company) {
}
