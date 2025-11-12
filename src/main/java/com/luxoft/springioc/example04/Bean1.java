package com.luxoft.springioc.example04;

import static java.lang.IO.*;

public class Bean1 {
  public Bean1() {
    println("Inside %s constructor"
                .formatted(getClass().getSimpleName()));
  }
}
