package com.luxoft.springioc.example10_correct;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext(
        "/example10_correct/application-context.xml");
    println(context.getBean("a"));
  }
}
