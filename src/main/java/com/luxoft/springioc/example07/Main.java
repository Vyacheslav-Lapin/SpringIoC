package com.luxoft.springioc.example07;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example07/application-context.xml");

    if (context.getBean("itCompany") instanceof Company itCompany
        && context.getBean("serviceCompany") instanceof Company serviceCompany)
      println(itCompany == serviceCompany);
  }
}
