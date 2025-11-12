package com.luxoft.springioc.example20;

import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.IO.*;

@Getter
public class SimpleMovieLister {

  @Setter(onMethod_ = @Autowired)
  MovieFinder movieFinder;

  void main() {
    @Cleanup val context = new ClassPathXmlApplicationContext("/example20/application-context.xml");

    if (context.getBean("simpleMovieLister") instanceof SimpleMovieLister simpleMovieLister) {
      println(simpleMovieLister.getMovieFinder().getName());
    }
  }
}
