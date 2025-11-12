package com.luxoft.springioc.example17;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() throws Exception {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example17/application-context.xml");

    if (context.getBean("child") instanceof ComplexObject complexObject) {
      complexObject.getAdminEmails()
                   .forEach((key, value) -> println(key + ": " + value));

      Thread.sleep(1_000);

      println(complexObject.getAdminEmails().get("administrator"));
      println(complexObject.getAdminEmails().get("sales"));
      println(complexObject.getAdminEmails().get("support"));
    }
  }

}
