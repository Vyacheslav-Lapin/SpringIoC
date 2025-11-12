package com.luxoft.springioc.example23;

import lombok.AllArgsConstructor;
import lombok.Cleanup;
import lombok.val;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import static java.lang.IO.*;
import static org.springframework.beans.factory.config.BeanDefinition.*;

@Component
class Adder {
  public int add(int a, int b) {
    return a + b;
  }
}

@Component
class Multiplier {
  public int multiply(int a, int b) {
    return a * b;
  }
}

@Service//("calculator")
@Scope(SCOPE_PROTOTYPE)
@AllArgsConstructor
public class Calculator {

  Adder adder;
  Multiplier multiplier;

  static void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example23/application-context.xml");

    if (context.getBean("calculator") instanceof Calculator calculator) {
      println("calculator.adder.hashCode() = " + calculator.adder.hashCode());

      // TODO: add multiplier to calculator and check its correctness
      println("calculator.multiplier.hashCode() = " + calculator.multiplier.hashCode());

      calculator.makeAnOperation();
    }
  }

  public void makeAnOperation() {
    int sum = adder.add(1, 2);
    println("sum = " + sum);

    println("mult = " + multiplier.multiply(sum, 3));
  }

}
