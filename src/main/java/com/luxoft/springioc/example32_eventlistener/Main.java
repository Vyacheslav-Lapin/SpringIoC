package com.luxoft.springioc.example32_eventlistener;

import lombok.Cleanup;
import lombok.val;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example32_eventlistener/application-context.xml");
    if (context.getBean("commandManager") instanceof CommandManager commandManager) {
      commandManager.getApplicationContext().publishEvent(new CustomEvent(new Object()));
      commandManager.getApplicationContext().publishEvent(new CustomEvent2(new Object()));
    }
  }
}
