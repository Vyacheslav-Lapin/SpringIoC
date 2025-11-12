package com.luxoft.springioc.example18;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example18/application-context.xml");

    if (context.getBean("exampleBean") instanceof ExampleBean exampleBean) {
      println(exampleBean.getName());
      println(exampleBean.getEmail());
    }
  }
}
