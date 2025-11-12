package com.luxoft.springioc.example03;

import com.luxoft.springioc.ClientService;
import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext(
        "/example03/client-service.xml");

    val clientService = (ClientService) context.getBean("clientService");
    println(clientService.hashCode());
  }
}
