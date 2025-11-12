package com.luxoft.springioc.example13;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example13/application-context.xml");

    if (context.getBean("loginManager") instanceof LoginManager loginManager) {
      println(loginManager.hashCode());

      if (context.getBean("userDirectorySearch") instanceof UserDirectorySearch userDirectorySearch) {
        println(userDirectorySearch.hashCode());

        if (context.getBean("userInfo") instanceof UserInfo userInfo) {
          println(userInfo.hashCode());

          println(loginManager.getUserDirectory() == userDirectorySearch.getUserDirectory());
          println(userInfo.getLdapUserDirectory());
        }
      }
    }
  }
}
