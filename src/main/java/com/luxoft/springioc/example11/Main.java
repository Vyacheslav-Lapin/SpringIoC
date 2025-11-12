package com.luxoft.springioc.example11;

import com.luxoft.springioc.ClientService;
import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example11/client-service-factory-method.xml");

    if (context.getBean("clientService") instanceof ClientService clientService)
      println(clientService);
  }
}
