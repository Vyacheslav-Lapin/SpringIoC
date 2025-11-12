package com.luxoft.springioc.example02;

import lombok.experimental.ExtensionMethod;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import static java.lang.IO.*;

@SuppressWarnings({"java:S2116", "ImplicitArrayToString"})
@ExtensionMethod(Arrays.class)
public class Main {
  void main() {
    val context = new ClassPathXmlApplicationContext("example02/services.xml", "example02/daos.xml");
    val service = context.getBean(ServiceBean.class);
    service.printNames();

    val daoBean = context.getBean(DaoBean.class);
    println(daoBean.getData().toString());
  }
}
