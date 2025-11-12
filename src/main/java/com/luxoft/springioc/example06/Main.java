package com.luxoft.springioc.example06;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example06/application-context.xml");

    val dataSource = (DataSource) context.getBean("dataSource");
    println(dataSource.getDriverClassName());
    println(dataSource.getUrl());
    println(dataSource.getUsername());
    println(dataSource.getPassword());
  }
}
