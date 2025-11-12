package com.luxoft.springioc.example04;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context =
        new ClassPathXmlApplicationContext("/example04/application-context.xml");

    println("Lazy initialization on requirement:");
    if (context.getBean("bean4") instanceof Bean4 bean4)
      println(bean4.hashCode());
  }
}
