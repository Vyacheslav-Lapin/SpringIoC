package com.luxoft.springioc.example32_eventlistener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import static java.lang.IO.*;

@Component
public class Bean {

  @EventListener
  public void blogModified(CustomEvent customEvent) {
    println("CustomEvent received through @EventListener");
  }

  @EventListener
  public void blogModified2(CustomEvent2 customEvent) {
    println("CustomEvent2 received through @EventListener");
  }

}
