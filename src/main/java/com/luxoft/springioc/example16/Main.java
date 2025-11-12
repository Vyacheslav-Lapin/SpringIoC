package com.luxoft.springioc.example16;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example16/application-context.xml");
    if (context.getBean("inheritsWithDifferentClass") instanceof TestBean derivedTestBean) {
      println(derivedTestBean.getName());
      println(derivedTestBean.getAge());
    }
  }
}
