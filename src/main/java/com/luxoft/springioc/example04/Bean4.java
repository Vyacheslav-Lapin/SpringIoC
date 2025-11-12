package com.luxoft.springioc.example04;

import static java.lang.IO.*;

public class Bean4 {
  public Bean4() {
    println("Inside %s constructor".formatted(getClass().getSimpleName()));
  }
}
