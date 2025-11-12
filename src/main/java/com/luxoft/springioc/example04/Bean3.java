package com.luxoft.springioc.example04;

import static java.lang.IO.*;

public class Bean3 {
  public Bean3() {
    println("Inside %s constructor".formatted(getClass().getSimpleName()));
  }
}
