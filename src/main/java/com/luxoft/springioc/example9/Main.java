package com.luxoft.springioc.example9;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example9/application-context.xml");

    if (context.getBean("smithPerson") instanceof Person smithPerson) {
      println(smithPerson.getCompany().getName());
      println(smithPerson.getName());
    }
  }
}
