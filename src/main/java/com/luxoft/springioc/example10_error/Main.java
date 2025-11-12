package com.luxoft.springioc.example10_error;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

@SuppressWarnings({"java:S1481", "java:S1854"})
public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example10_error/application-context.xml");
    println(context.getBean("a"));
  }
}
