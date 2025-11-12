package com.luxoft.springioc.example24;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {

  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example24/application-context.xml");

    if (context.getBean("bean") instanceof Bean bean1
        && context.getBean("bean") instanceof Bean bean2
        && context.getBean("bean") instanceof Bean bean3
        && context.getBean("bean") instanceof Bean bean4) {

      println(bean1 == bean2);
      println(bean1 == bean3);
      println(bean1 == bean4);
    }
  }
}
