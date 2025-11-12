package com.luxoft.springioc.example04;

import static java.lang.IO.*;

public class Bean2 {
  public Bean2() {
    println("Inside %s constructor".formatted(getClass().getSimpleName()));
  }
}
