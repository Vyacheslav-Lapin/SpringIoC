package com.luxoft.springioc.example27;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Bean3AnnotationBased {

  @PostConstruct
  public void sameAsInitMethodFromXml() {
    System.out.println("User custom init method for Bean3AnnotationBased");
  }

  @PreDestroy
  public void sameAsDestroyMethodFromXml() {
    System.out.println("User custom cleanup method for Bean3AnnotationBased");
  }

}
