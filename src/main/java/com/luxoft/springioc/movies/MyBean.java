package com.luxoft.springioc.movies;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.function.IntSupplier;

//@Component
@AllArgsConstructor
public class MyBean {

  IntSupplier intSupplier;

  public final String method(int x) {
    return x + intSupplier.getAsInt() + "Lorem ipsum";
  }
}

//@Component
class MyNumSupplier implements IntSupplier {

  @Override
  public int getAsInt() { return 55; }
}

@Configuration
class MyConfig {

  @Bean(name = {"myBean", "hbsdfg", "kjhgsdf", "hgsdf", "uihjbnnmf"})
  @Lazy
  MyBean myBean(MyNumSupplier myNumSupplier) {
    return new MyBean(myNumSupplier);
  }

  @Bean
  MyNumSupplier myNumSupplier() {
    return new MyNumSupplier();
  }
}
