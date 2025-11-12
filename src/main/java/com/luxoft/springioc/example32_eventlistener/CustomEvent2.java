package com.luxoft.springioc.example32_eventlistener;

import org.springframework.context.ApplicationEvent;

public class CustomEvent2 extends ApplicationEvent {

  private static final long serialVersionUID = 2545745837098118673L;

  public CustomEvent2(Object source) {
    super(source);
  }

}
