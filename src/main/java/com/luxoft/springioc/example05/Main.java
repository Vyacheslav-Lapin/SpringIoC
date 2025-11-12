package com.luxoft.springioc.example05;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {

  void main() {
    @Cleanup val context =
        new ClassPathXmlApplicationContext("/example05/application-context.xml");

    if (context.getBean("message") instanceof Message message
        && context.getBean("theme") instanceof Theme theme
        && context.getBean("bean1") instanceof Bean1 bean1
        && context.getBean("bean2") instanceof Bean2 bean2) {

            println(message.hashCode());
            println(theme.hashCode());
            println(bean1.hashCode());
            println(bean2.hashCode());

            println(theme.getName());
          }
  }
}
