package com.luxoft.springioc.example15;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {

  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example15/application-context.xml");

    if (context.getBean("customerBean") instanceof Customer customerBean) {
      println(customerBean.hashCode());
      println(customerBean.getList().getClass().getName());
      println(customerBean.getList().size());

      println(customerBean.getSet().size());

      println(customerBean.getMap().getClass().getName());
      println(customerBean.getMap().keySet().size());
      println(customerBean.getMap().values().size());

      println(customerBean.getStringsMap().getClass().getName());
      println(customerBean.getStringsMap().keySet().size());
      println(customerBean.getStringsMap().values().size());

      println(customerBean.getPersonsMap().getClass().getName());
      println(customerBean.getPersonsMap().keySet().size());
      println(customerBean.getPersonsMap().values().size());

      println(customerBean.getProps().keySet().size());
      println(customerBean.getProps().values().size());
    }
  }


}
